import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ElementExistTest {

    WebDriver driver;
    ChromeOptions options = new ChromeOptions();


    @Test
    public void elementExistsTest() {
        driver = new ChromeDriver(options);
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.tagName("p")));
        System.out.println(driver.findElement(By.id("topSecret")));

        driver.findElement()
        if (driver.findElements(locator))

    }

//    public boolean elementExists (By locator) {
//        driver = new ChromeDriver(options);
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
//        try {
//            driver.findElement(locator);
//            return true;
//        } catch (NoSuchElementException ex) {
//            return false;
//        }
//    }


}