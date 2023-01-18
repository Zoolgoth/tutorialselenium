import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionsTest {

    // Dodawanie usuwanie klikanie w elementy na stronie

    @Test
    public void performAction() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium");
//        driver.findElement(By.xpath("/html/body/a[1]")).click();

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();
//        driver.findElement(By.id("clickOnMe")).click();
        driver.findElement(By.id("fname")).sendKeys("Przemek");
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.clear();
        userNameInput.sendKeys("admin");
        userNameInput.sendKeys(Keys.TAB);
//        driver.findElement(By.xpath("/html/body/label[2]")).click();
//        driver.findElement(By.cssSelector("body > label:nth-child(15) > input[type=checkbox]")).click();
//        driver.findElement(By.cssSelector("body > form:nth-child(16) > input[type=radio]:nth-child(1)")).click();
        driver.findElement(By.cssSelector("[value='male']")).click();
        driver.findElement(By.cssSelector("[value='female']")).click();
//        driver.findElement(By.cssSelector("body > select > option:nth-child(3)")).click();
//            driver.findElement(By.cssSelector("[value='mercedes']")).click();
            WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
//        cars.selectByIndex(2);
//        cars.selectByVisibleText("Saab");
        cars.selectByValue("volvo");

        List<WebElement> optionss = cars.getOptions();
        for (WebElement option : optionss) {
            System.out.println(option.getText());

        }



    }

}