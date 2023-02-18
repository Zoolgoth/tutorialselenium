package pl.travel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testerOprogramowania.DriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HotelSearch {

    // Testing http://www.kurs-selenium.pl/demo/
    // filling the pots of city

    @Test
    public void searchHotel () {

    WebDriver driver = DriverFactory.getDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("http://www.kurs-selenium.pl/demo/");
    driver.findElement(By.xpath("//span[text()='Search by Hotel or City Name']")).click();
    driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Dubai");
    driver.findElement(By.xpath("//span[@class='select2-match' and text()='Dubai']")).click();
    // Choosing data by writing it manually "17/04/2023"
    driver.findElement(By.name("checkin")).sendKeys("17/04/2023");
    driver.findElement(By.name("checkout")).sendKeys("20/04/2023");
    // now we choose the date in the calendar
     //        driver.findElement(By.name("checkout")).click();
//        driver.findElements(By.xpath("//td[@class='day ' and text()='30]"))
//        .stream()
//                .filter(WebElement::isDisplayed)
//                .findFirst()
//                .ifPresent(WebElement::click);

        // Setting amount of people in group
//    driver.findElement(By.xpath("//*[@id=\"travellersInput\"]")).clear();
//    driver.findElement(By.xpath("//*[@id=\"travellersInput\"]")).sendKeys("4 Adult 3 Child");
    //other option to add people in group
        driver.findElement(By.id("travellersInput")).click();
        driver.findElement(By.id("adultPlusBtn")).click();
        driver.findElement(By.id("childPlusBtn")).click();


        //click in button search on web
//        driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button")).click();
        driver.findElement(By.xpath("//button[text()=' Search']")).click();

        List<String> hotelNames = driver.findElements(By.xpath("//h4[contains(@class,'list_title')]//b")).stream()
                .map(el -> el.getAttribute("textContent")).collect(Collectors.toList());

        System.out.println(hotelNames.size());
        hotelNames.forEach(el -> System.out.println(el));

        hotelNames.forEach(System.out::println);


        Assert.assertEquals("Jumeirah Beach Hotel", hotelNames.get(0));
        Assert.assertEquals("Oasis Beach Tower", hotelNames.get(1));
        Assert.assertEquals("Rose Rayhaan Rotana", hotelNames.get(2));
        Assert.assertEquals("Hyatt Regency Perth", hotelNames.get(3));


    }

}