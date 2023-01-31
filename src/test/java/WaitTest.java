//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.List;
//
//public class WaitTest {
//
//    @Test
//    public void waitTest() {
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
//        WebDriver driver = new ChromeDriver(options);
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");
//
//        driver.findElement(By.id("clickOnMe")).click();
////        Thread.sleep(5000);
//
//        FluentWait<WebDriver> wait = new FluentWait<>(driver);
//        wait.ignoring(NoSuchElementException.class);
//        wait.withTimeout(Duration.ofSeconds(10));
//        // how long wait to check again (1)
//        wait.pollingEvery(Duration.ofSeconds(1));
//        driver.findElement(By.cssSelector("body > p")).click();
//
//        waitForElementToExists(By.cssSelector("p"));
//    }
//
//    // Wlasna metoda na odrzucenie wyjatku
//
//    public void waitForElementToExists (By locator) {
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("D:\\programiki\\chrome pod selenium\\chrome-win\\chrome.exe");
//        WebDriver driver = new ChromeDriver(options);
//
//        FluentWait<WebDriver> wait = new FluentWait<>(driver);
//        wait.ignoring(NoSuchElementException.class);
//        wait.withTimeout(Duration.ofSeconds(10));
//        wait.pollingEvery(Duration.ofSeconds(1));
//
//        // wlasna metoda/wlasny warunek do obejscia wyjatku
////        wait.until(new Function<WebDriver, Boolean>() {
////            @Override
////            public Boolean apply(WebDriver driver) {
////                List<WebElement> elements = driver.findElements(locator);
////                if (elements.size()>0) {
////                    System.out.println("Element jest na stronie");
////                    return true;
////                } else {
////                    System.out.println("Elementu nie ma na stronie");
////                    return false;
////                }
////            }
////        });
//
//        //lambda skrot metody wlasnego warunku do obejscia wyjatku
//        wait.until(driver1 ->  {
//                List<WebElement> elements = driver.findElements(locator);
//                if (elements.size()>0) {
//                    System.out.println("Element jest na stronie");
//                    return true;
//                } else {
//                    System.out.println("Elementu nie ma na stronie");
//                    return false;
//                }
//            });
//    }
//    }