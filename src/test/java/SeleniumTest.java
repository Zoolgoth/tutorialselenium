import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        Dimension windowSize = new Dimension(200, 200);
        driver.manage().window().setSize(windowSize);
        driver.get("https://www.google.com");
//            JavascriptExecutor executor = (Javasc iptExecutor) driver;
//            executor.executeScript("window.open('https://www.google.com','blank','height=200, width=200')");
//            driver.close();
        // przechodzimy do okienta z plikami cookies
        driver.switchTo().frame(0);
        // znajduje nam przycisk "zgadzam się"
        WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(), 'Zaakceptuj')]"));
        // akceptacja plikow cookie
        agreeButton.click();
        // powrot do pierwotnego okna
        driver.switchTo().defaultContent();
        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        // zasymuluj nacisniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//span"));
        // sprawdzenie

        Assert.assertTrue(result.isDisplayed());
    }

    //
    WebDriver driver = getDriver("chrome");

    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
                String chromePath = "C:\\chromedriver\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromePath);
                return new ChromeDriver(options);
        }
        throw new InvalidArgumentException("Invadlid browser name");
    }

    @Test
    public void exampleTest() {
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

//    @Test
//    public void openGooglePage() {
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("google.com");
//        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
//        driver.get("https://www.google.com");
//    }
}