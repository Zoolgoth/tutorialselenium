import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WaitTest {

    WebElement driver;

    @Test
    public void imageTest() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");

        driver.findElement(By.id("clickOnMe")).click();
//        Thread.sleep(5000);

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        // how long wait to check again (1)
        wait.pollingEvery(Duration.ofSeconds(1));
//        WebElement para = driver.findElement(By.cssSelector("pa"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));

        driver.findElement(By.cssSelector("p")).click();
        System.out.println(driver.findElement(By.cssSelector("body > p")).getText());

        waitForElementToExists(By.cssSelector("p"));

    }

    // Wlasna metoda na odrzucenie wyjatku

    public void waitForElementToExists (By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

        // wlasna metoda/wlasny warunek do obejscia wyjatku
//        wait.until(new Function<WebDriver, Boolean>() {
//            @Override
//            public Boolean apply(WebDriver driver) {
//                List<WebElement> elements = driver.findElements(locator);
//                if (elements.size()>0) {
//                    System.out.println("Element jest na stronie");
//                    return true;
//                } else {
//                    System.out.println("Elementu nie ma na stronie");
//                    return false;
//                }
//            }
//        });

        //lambda skrot metody wlasnego warunku do obejscia wyjatku
        wait.until(driver1 ->  {
                List<WebElement> elements = driver.findElements(locator);
                if (elements.size()>0) {
                    System.out.println("Element jest na stronie");
                    return true;
                } else {
                    System.out.println("Elementu nie ma na stronie");
                    return false;
                }
            });
    }
    }