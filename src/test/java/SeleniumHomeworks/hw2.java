package SeleniumHomeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static net.jodah.failsafe.internal.util.Assert.*;

public class hw2 {
    //1.Yeni bir class olusturalim (Homework)
    //2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
    //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
    //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
    //yazdirin.
    //4.https://www.walmart.com/ sayfasina gidin.
    //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
    //6. Tekrar “facebook” sayfasina donun
    //7. Sayfayi yenileyin
    //8. Sayfayi tam sayfa (maximize) yapin
    //9.Browser’i kapatin

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1.
        driver.navigate().to("https://www.facebook.com/");
        //2.
        String actualTitle= driver.getTitle();
        String expectedResult="facebook";

        if (actualTitle.equals(expectedResult)) {
            System.out.println("Pass");
        } else {
            System.out.println(actualTitle);
        }

        //3. Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="facebook";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Pass");
        } else {
            System.out.println(actualUrl);
        }






    }

}