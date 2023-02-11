package pl.testerOprogramowania;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HotelSearch {

    WebDriver driver = DriverFactory.getDriver();

    @Test
    public void searchHotel() {
        driver = DriverFactory.getDriver();
        driver.get("http://www.kurs-selenium.pl/demo/");
    }

}