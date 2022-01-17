package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {

    //1. Yeni bir Class olusturalim.C07_ManageWindowSet
    //2. Amazon soyfasina gidelim. https://www.amazon.com/
    //3. Sayfanin konumunu ve boyutlarini yazdirin
    //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
    //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
    //8. Sayfayi kapatin

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point( 0,0));
        driver.manage().window().setSize(new Dimension(300,500));

        int xPoz=driver.manage().window().getPosition().getX();
        int yPoz=driver.manage().window().getPosition().getY();
        int genis=driver.manage().window().getSize().getWidth();
        int yuksek=driver.manage().window().getSize().getHeight();

        System.out.println(xPoz +"  "+ yPoz+"   "+genis+"  "+yuksek);

        if (xPoz==0 && yPoz==0 && genis==300 && yuksek==500) {
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }
        driver.quit();












    }







}
