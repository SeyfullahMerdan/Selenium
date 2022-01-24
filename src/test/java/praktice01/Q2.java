package praktice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
////  1-driver olusturalim
////  2-java class'imiza chromedriver.exe'yi tanitalim
////  3-driver'in tum ekrani kaplamasini saglayalim
////  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
////    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
////  5-"sahibinden.com" adresine gidelim
////  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
////  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
////  8-Ardindan "gittigidiyor.com" adresine gidelim
////  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
////    kontrol edelim
////  10-Bi onceki web sayfamiza geri donelim
////  11-sayfayi yenileyelim
////  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
////  13-En son adim olarak butun sayfalarimizi kapatmis olalim



    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  5-"sahibinden.com" adresine gidelim
       //  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        driver.get(" https://www.otto.de");
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title + "\n" + url);

  //  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim


        System.out.println( title.contains("Oto") ? "PASS" : "FAİLED" );

        if (url.contains("Oto")) {
            System.out.println("Url'de Oto yazısı vardır");
        } else
            System.out.println("Url'de Oto yazısı yoktur");



 //  8-Ardindan "gittigidiyor.com" adresine gidelim

         driver.get("https://www.gittigidiyor.com/");


 //  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
 //    kontrol edelim

        boolean isTrue=driver.getTitle().contains("Sitesi");

        if (isTrue) {
            System.out.println("Test PASS");
        } else
            System.out.println("Test FAİLED");


 //  10-Bi onceki web sayfamiza geri donelim

        driver.navigate().back();


 //  11-sayfayi yenileyelim

        driver.navigate().refresh();

 //  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim

        driver.navigate().forward();


 //  13-En son adim olarak butun sayfalarimizi kapatmis olalim

        Thread.sleep(1500);
        driver.close();


    }

}
