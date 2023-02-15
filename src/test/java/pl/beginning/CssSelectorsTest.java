package pl.beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CssSelectorsTest {
    @Test
    public void findElements () {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("Pierwszy");

        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        By cssClass2 = By.cssSelector("[class='topSecret']");
        driver.findElement(cssClass2);

        By all = By.cssSelector("*");
        driver.findElement(all);

        By ulInDiv = By.cssSelector("div ul");
        By trInTable = By.cssSelector("table tr");
        By trInBody = By.cssSelector("tbody tr");
        driver.findElement(ulInDiv);
        driver.findElement(trInTable);
        driver.findElement(trInBody);

        By firstChildUlinDiv = By.cssSelector("div > ul");
        By firstChildTrInTbody = By.cssSelector("tbody > tr");
        driver.findElement(firstChildUlinDiv);
        driver.findElement(firstChildUlinDiv);

        By firstFormAfterLabel = By.cssSelector("label + form");
        By allFormAfterLabel = By.cssSelector("label ~ form");
        driver.findElement(firstFormAfterLabel);
        driver.findElement(allFormAfterLabel);

        By attrTag = By.cssSelector("input[name='fname']");
        By attrContains = By.cssSelector("[name*='name']");
        By attrStarts = By.cssSelector("[name^='f']");
        By attrEnds = By.cssSelector("[name$^='name']");

        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnds);

        By firstChild = By.cssSelector("li:first-child");
        By lastchild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");

        driver.findElement(firstChild);
        driver.findElement(lastchild);
        driver.findElement(thirdChild);

//        By wyszukiwarkaGoogle = By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input");
//        driver.findElement(wyszukiwarkaGoogle);


    }
}
