package pl.beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewWindowTest {

    @Test
    public void testNewWindow(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        // accepting cookies from tutorial doest work =/
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        String currentWindow = driver.getWindowHandle();
//        driver.findElement(By.id("newPage")).click();
//        Set<String> windowNames = driver.getWindowHandles();
//        for(String window : windowNames){
//            if (!window.equals(currentWindow)) {
//                driver.switchTo().window(window);
//            }
//        }
//        driver.findElement(By.name("q")).sendKeys("Selenium");

        // -- other idea to accept cookies:
        driver.get("https://onet.pl");
        driver.findElement(By.cssSelector("#rasp_cmp > div > div.cmp-intro_options > button.cmp-button_button.cmp-intro_acceptAll > span"
        )).click();



    }
}
