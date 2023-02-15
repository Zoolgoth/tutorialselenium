import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class HoverTest {

    @Test
    public void actionsTest() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        // najechanie na element
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        Actions actions = new Actions(driver);

        WebElement heading = driver.findElement(By.tagName("h1"));
        actions.moveToElement(heading).perform();
        // select and drop to other place
//        actions.dragAndDrop()

    } 
}