package SeleniumHomeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw3 {
    //
    //        1-driver olusturalim--
    //        2-java class'imiza chromedriver.exe'yi tanitalim--
    //        3-driver'in tum ekrani kaplamasini saglayalim--
    //        4-https://github.com/ adresine gidelim
    //        5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
    //        6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
    //        7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
    //        8-Son adim olarak butun sayfalarimizi kapatmis olalim
    //

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://github.com/");
        driver.navigate().to("https://www.hepsiburada.com/ ");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();
        String searchWord="burada";

        System.out.println(actualTitle.contains(searchWord) ? "Title Test PASS" : "Title Test FAİLED");
        System.out.println(actualUrl.contains(searchWord) ? "URL Test PASS" : "URL Test FAİLED");

        driver.navigate().back();
        driver.navigate().back();

        driver.navigate().refresh();

        driver.close();
        driver.quit();

    }
}
