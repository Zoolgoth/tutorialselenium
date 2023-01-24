import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Homework {
// Things i want to do:
// on https://testeroprogramowania.github.io/selenium/basics.html
//   Create tests that work on basics.html
//1. open browser
//2. get text from head
//3. click bottom
//4. click link
//5. get text from array
//6. Select Saab option
//7. I submit option
//8. i select "female"
//9. clear input name/password than write new one
//10. Click "click me"

    @Test
    public void homeWorkTest() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        //1
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //2
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        //3
        driver.findElement(By.id("clickOnMe")).click();
        driver.switchTo().alert().accept();
        //4
        driver.findElement(By.linkText("Visit W3Schools.com!")).click();
        driver.findElement(By.id("accept-choices")).click();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //5
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText());
        //6
        driver.findElement(By.cssSelector("body > select > option:nth-child(2)")).click();
        //7
        driver.findElement(By.cssSelector("body > form:nth-child(16) > input[type=radio]:nth-child(3)")).click();
        //8
        driver.findElement(By.cssSelector("body > label:nth-child(15)")).click();
        //9
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("password")).clear();

        driver.findElement(By.name("username")).sendKeys("ZooL");
        driver.findElement(By.name("password")).sendKeys("Looking for job");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        driver.findElement(By.id("newPage")).click();


    }

}
