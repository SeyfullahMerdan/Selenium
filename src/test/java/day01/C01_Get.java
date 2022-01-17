package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Get {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
     // Biz driver objesi oluşturdugumuzda boş bir chrome browser açılır.

        driver.get("http://www.amazon.com");
    // driver.get methodu drivera gidecegi web adresini girmemizi sağlar.


         Thread.sleep(3000);    // güvenli kapatma saglıyor, 3 saniye bekletiyor.


          driver.close();
        // driveri kapatır
    }
}