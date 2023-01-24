import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GetPageInfoTest {

    // Dodawanie usuwanie klikanie w elementy na stronie

    @Test
    public void getInfo() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

}