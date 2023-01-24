import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class UploadTest {

    @Test
    public void uploadFile() throws IOException {
        // screenshot if i need

        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        int randomNumber = (int) Math.random()*1000;
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        // sikuli file upload is another option

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File before = screenshot.getScreenshotAs(OutputType.FILE);
        String fileName = "beforeupload" + randomNumber + ".png";
        FileUtils.copyFile(before, new File("src/test/resources" +fileName));

        driver.findElement(By.id("myFile")).
                sendKeys("C:\\Users\\User\\Desktop\\Pliki txt\\plik.txt");
        //Using mouse right click~
        Actions actions = new Actions(driver);
        // actions.contextClick().perform();
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();
    }
}