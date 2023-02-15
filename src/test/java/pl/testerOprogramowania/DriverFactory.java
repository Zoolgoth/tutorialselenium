package pl.testerOprogramowania;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver==null) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("D:\\programiki\\chromePodSelenium\\chrome-win\\chrome.exe");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

}
