package day04_xPathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XpathText {

    // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        WebElement deleteButonu=driver.findElement(By.xpath("//button[text()='Delete']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Passed - delete gözüküyor");
        } else {
            System.out.println("Failed - delete gözükmüyor");
        }

        Thread.sleep(2000);

        deleteButonu.click();

       WebElement addYazisiElementi=driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));

        if (addYazisiElementi.isDisplayed()) {
            System.out.println("add yazisi  gorunuyor testi PASS");
        }else System.out.println("add yazisi gorunuyor testi FAİLDE");

        //driver.close();



    }
}
