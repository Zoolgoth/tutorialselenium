package pl.beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class consolidationOfKnowledge {
    @Test
    public void findElements () {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("ok");
        driver.findElement(By.cssSelector("#clickOnMe")).click();
        driver.findElement(By.cssSelector("body > select")).getAttribute("Saab");
        driver.findElement(By.cssSelector("body > form:nth-child(17) > input[type=text]:nth-child(2)")).clear();
        driver.findElement(By.cssSelector("body > form:nth-child(17) > input[type=text]:nth-child(2)")).sendKeys("juzek");
        driver.findElement(By.cssSelector("body > form:nth-child(17) > input[type=password]:nth-child(5)")).clear();
        driver.findElement(By.cssSelector("body > form:nth-child(17) > input[type=password]:nth-child(5)")).sendKeys("palka");
        driver.findElement(By.cssSelector("body > form:nth-child(17) > input[type=submit]:nth-child(8)")).click();

        driver.findElement(By.linkText("IamWeirdLink")).click();
        driver.findElement(By.partialLinkText("Iam")).click();
    }
}