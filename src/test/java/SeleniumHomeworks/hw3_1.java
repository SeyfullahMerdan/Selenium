package SeleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class hw3_1 {

    // 1.  https://id.heroku.com/login sayfasina gidin
    //2.  Bir mail adersi giriniz
    //3.  Bir password giriniz
    //4.  Login butonuna tiklayiniz
    //5.  "There was a problem with your login." texti gorunur ise
    //6.  "kayit yapilamadi" yazdiriniz
    //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
    //9.  Tum sayfalari kapatiniz

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://id.heroku.com/login");

        WebElement mailKutusu=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement passwordKutusu=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButonu=driver.findElement(By.xpath("//button[@name='commit']"));

        mailKutusu.sendKeys("merdanseyfullah3@gmail.com");
        passwordKutusu.sendKeys("12345fdsA.");
        loginButonu.submit();



        System.out.println( driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed()
                ?  "Kayıt yapılamadı"  : "Kayıt yapıldı"    );

        Thread.sleep(1000);

        driver.quit();



    }
}
