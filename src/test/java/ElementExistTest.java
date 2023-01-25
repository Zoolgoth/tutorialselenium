import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ElementExistTest {


    @Test
    public void elementExistsTest() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


        //checking if thing is displayed
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed());

        //checking if thing is able to use
        System.out.println(driver.findElement(By.tagName("button")).isEnabled());

        //check if checkbox is clicked or not

        System.out.println("-----");
        WebElement checkbox = driver.findElement(By.cssSelector("[type='checkbox']"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());



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