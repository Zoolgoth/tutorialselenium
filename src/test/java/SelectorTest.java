import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElements() {
//        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

//        click on me
//        driver.findElement(By.id("clickOnMe")).click();

        //find by name
//        driver.findElement(By.name("fname")).sendKeys("wpisz tekst");

        //find by
        driver.findElement(By.className("topSecret"));

        // by input
        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);
        System.out.println(linkText);

        By partialLink = By.partialLinkText("Visit");
        WebElement schoolPartial = driver.findElement(partialLink);


    }
}