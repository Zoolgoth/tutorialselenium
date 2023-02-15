package pl.beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IframeTest {

    @Test
    public void testNewWindow(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        // accepting cookies from tutorial doest work =/
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        WebElement iframe = driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.id("fname")).sendKeys("ZooL");
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());





        // my way to accept cookies:
//        driver.get("https://onet.pl");
//        driver.findElement(By.cssSelector("#rasp_cmp > div > div.cmp-intro_options > " +
//                "button.cmp-button_button.cmp-intro_acceptAll")).click();





    }
}
