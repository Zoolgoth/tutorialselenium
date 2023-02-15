package pl.testerOprogramowania;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SecondTest extends BaseTest {

    WebDriver driver = DriverFactory.getDriver();

    @Test
    public void firstTest() {
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
//        WebDriver driver = new ChromeDriver(options);
        driver = DriverFactory.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver.findElement(By.cssSelector("#clickOnMe")).click();
        waitForElementToExist(By.cssSelector("body > p"));

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
        driver.quit();
    }

    @Test
    public void secondTest() {
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver = DriverFactory.getDriver();
        driver.findElement(By.cssSelector("#clickOnMe")).click();
        waitForElementToExist(By.cssSelector("body > p"));

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
        driver.quit();
    }

    public void waitForElementToExist (By locator) {
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        driver = DriverFactory.getDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

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