import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class ActionsTest {

    @Test
    public void uploadFile() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        //Using mouse right click~
        Actions actions = new Actions(driver);
        // actions.contextClick().perform();
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();
    } 
}