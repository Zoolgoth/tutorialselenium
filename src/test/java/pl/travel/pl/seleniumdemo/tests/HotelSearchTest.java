package pl.travel.pl.seleniumdemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.travel.pl.seleniumdemo.pages.HotelSearchPage;

import java.util.List;
import java.util.stream.Collectors;

public class HotelSearchTest extends BaseTest {


    // Testing http://www.kurs-selenium.pl/demo/
    // filling the pots of city

    @Test
    public void searchHotelTest () {

        HotelSearchPage hotelSearchPage = new HotelSearchPage();
        hotelSearchPage.setCity("Dubai");
        hotelSearchPage.setDates("27/04/2021", "29/042021");
        hotelSearchPage.setTravellersInput();
        hotelSearchPage.performSearch();


// DELETE
//    driver.findElement(By.xpath("//span[text()='Search by Hotel or City Name']")).click();
//    driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Dubai");
//    driver.findElement(By.xpath("//span[@class='select2-match' and text()='Dubai']")).click();
//    // Choosing data by writing it manually "17/04/2023"
//    driver.findElement(By.name("checkin")).sendKeys("17/04/2023");
//    driver.findElement(By.name("checkout")).sendKeys("20/04/2023");
//    // now we choose the date in the calendar
//     //        driver.findElement(By.name("checkout")).click();
////        driver.findElements(By.xpath("//td[@class='day ' and text()='30]"))
////        .stream()
////                .filter(WebElement::isDisplayed)
////                .findFirst()
////                .ifPresent(WebElement::click);
//
//        // Setting amount of people in group
////    driver.findElement(By.xpath("//*[@id=\"travellersInput\"]")).clear();
////    driver.findElement(By.xpath("//*[@id=\"travellersInput\"]")).sendKeys("4 Adult 3 Child");
//    //other option to add people in group
//        driver.findElement(By.id("travellersInput")).click();
//        driver.findElement(By.id("adultPlusBtn")).click();
//        driver.findElement(By.id("childPlusBtn")).click();
//
//
//        //click in button search on web
////        driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button")).click();
//        driver.findElement(By.xpath("//button[text()=' Search']")).click();

        List<String> hotelNames = driver.findElements(By.xpath("//h4[contains(@class,'list_title')]//b")).stream()
                .map(el -> el.getAttribute("textContent")).collect(Collectors.toList());

        System.out.println(hotelNames.size());
        hotelNames.forEach(el -> System.out.println(el));

        hotelNames.forEach(System.out::println);


        Assert.assertEquals(hotelNames.get(0),"Jumeirah Beach Hotel");
        Assert.assertEquals(hotelNames.get(1),"Oasis Beach Tower");
        Assert.assertEquals(hotelNames.get(2),"Rose Rayhaan Rotana");
        Assert.assertEquals(hotelNames.get(3),"Hyatt Regency Perth");
    }


    //HOMEWORK exercise

    @Test
    public void searchHotelWithoutNameTest () {

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

        driver.findElement(By.id("travellersInput")).click();
        driver.findElement(By.id("adultPlusBtn")).click();
        driver.findElement(By.id("childPlusBtn")).click();


        //click in button search on web
//        driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button")).click();
        driver.findElement(By.xpath("//button[text()=' Search']")).click();

        WebElement noResultHeading = driver.findElement(By.xpath("//div[@class='itemscontainer']//h2"));


        Assert.assertTrue(noResultHeading.isDisplayed());
        Assert.assertEquals(noResultHeading.getText(), "No Results Found");
    }

}