package MySelfWorkSpaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class web_elements2 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.sahibinden.com.tr");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());

        Thread.sleep(2000);

        driver.navigate().to("https://www.ebay.com");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        driver.manage().window().getSize();






























    }




}
