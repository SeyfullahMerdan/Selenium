package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {

    public static void main(String[] args) throws InterruptedException {

        //1. Yeni bir Class olusturalim.C06_ManageWindow
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        //4. Sayfayi simge durumuna getirin
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //7. Sayfayi fullscreen yapin
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        //8. Sayfayi kapatin


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");
        System.out.println( "Başlangıçta position " +driver.manage().window().getPosition());
        System.out.println( "Başlangıçta boyut" +driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("Maximize durumunda position " + driver.manage().window().getPosition());
        System.out.println("Maximize durumunda boyut " + driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen durumunda position "    + driver.manage().window().getPosition());
        System.out.println("Fullscreen durumunda boyut "   + driver.manage().window().getSize());
        driver.quit();















    }




}
