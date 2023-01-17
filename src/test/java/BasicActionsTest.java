import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

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
        basicPageLink.click();
//        driver.findElement(By.id("clickOnMe")).click();
        driver.findElement(By.id("fname")).sendKeys("Przemek");
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.clear();
        userNameInput.sendKeys("admin");
        userNameInput.sendKeys(Keys.TAB);


    }

}