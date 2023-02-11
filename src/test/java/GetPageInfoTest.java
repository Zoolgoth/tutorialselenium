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
//stworzyc test ktory zadziala na wszystkie elementy w basics
//1. otworz przegladarke
//2. pobiore tekst z headinga
//3. klikam przycisk
//4. klikam link
//5. pobieram wartosc z tabelki np miesiac
//6. Select wybieramy opcje
//7. klikam potwierdzam 100%
//8. wybieram opcje female
//9. czyszcze pola nazwa/haslo klikam enter
//10. klikam click me