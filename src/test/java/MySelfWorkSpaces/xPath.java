package MySelfWorkSpaces;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xPath {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. “https://www.saucedemo.com” Adresine gidin

        driver.get("https://www.saucedemo.com");

        //    //2. Username kutusuna “standard_user” yazdirin

        WebElement userName=driver.findElement(By.id("user-name"));

        //    //3. Password kutusuna “secret_sauce” yazdirin

        WebElement password=driver.findElement(By.id("password"));

        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        //    //4. Login tusuna basin

        WebElement login=driver.findElement(By.id("login-button"));
        login.click();

        //    //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

        WebElement firstProduct=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        String firstProductS= firstProduct.getText();
        System.out.println(firstProductS);
        firstProduct.click();

        //    //6. Add to Cart butonuna basin

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

        //    //7. Alisveris sepetine tiklayin

        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();


        //    //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin

        WebElement product=driver.findElement(By.className("inventory_item_name"));
        String productSuccess = product.getText();

        System.out.println(productSuccess.contains(firstProductS) ? "Test PASS" : "TEST FAİLED" );


        //    //9. Sayfayi kapatin

        Thread.sleep(1500);
        driver.close();









    }

}
