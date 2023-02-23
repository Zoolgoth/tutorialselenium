package pl.travel.pl.seleniumdemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    // Testing http://www.kurs-selenium.pl/demo/
    // filling the pots of city

    @Test
    public void singUpTest () throws InterruptedException {
        driver.findElements(By.xpath("//li[@id='li_myaccount']")).stream()
        .filter(WebElement::isDisplayed).findFirst().ifPresent(WebElement::click);
        driver.findElements(By.xpath("//a[text()='  Sign Up']")).get(1).click();

    // My solution:
//    driver.findElement(By.name("firstname")).sendKeys("Juzek" + Keys.TAB + "Palka" +
//            Keys.TAB + "48 500 699 676" + Keys.TAB + "pdackow@wp.pl" +
//            Keys.TAB + "NewPassword123" + Keys.TAB + "NewPassword123");

        String lastName = "Palka";
        // Unique email for every new run
        int randomNumber = (int) (Math.random()*1000);
        String email = "tester" + randomNumber + "@tester.pl";
        driver.findElement(By.name("firstname")).sendKeys("Juzek");
        driver.findElement(By.name("lastname")).sendKeys(lastName);
        driver.findElement(By.name("phone")).sendKeys("+48 500 699 676");

        driver.findElement(By.name("email")).sendKeys(email);

        driver.findElement(By.name("password")).sendKeys("NewPassword123");
        driver.findElement(By.name("confirmpassword")).sendKeys("NewPassword123");

        driver.findElement(By.xpath("//button[@type='submit' and text()=' Sign Up']")).click();

       WebElement heading = driver.findElement(By.xpath("//h3[@class='RTL']"));

        Assert.assertTrue(heading.getText().contains(lastName));
        Assert.assertEquals(heading.getText(), "Hi, Juzek Palka");
        driver.quit();


    }

}