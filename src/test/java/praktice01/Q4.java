package praktice01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4 {
    // // Navigate to  https://testpages.herokuapp.com/styled/index.html
    //// Click on  Calculate under Micro Apps
    ////    Type any number in the first input
    ////    Type any number in the second input
    //// Click on Calculate
    //// Get the result
    //// Print the result

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("10" + Keys.ENTER);
        driver.findElement(By.xpath("//option[@value='divide']")).click();
        driver.findElement(By.id("number2")).sendKeys("5" + Keys.ENTER);
        driver.findElement(By.id("calculate")).click();

       String result = driver.findElement(By.id("answer")).getText();
       System.out.println("result = " + result);
    }
}
