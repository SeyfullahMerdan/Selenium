package praktice01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    // // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    ////fill the firstname
    ////fill the firstname
    ////check the gender
    ////check the experience
    ////fill the date
    ////choose your profession -> Automation Tester
    ////choose your tool -> Selenium Webdriver
    ////choose your continent -> Antartica
    ////choose your command  -> Browser Commands
    ////click submit button

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//a[@class='cc_btn cc_btn_accept_all']")).click();
        driver.findElement(By.id("cookieChoiceDismiss")).click();

        ////fill the firstname
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.click();
        firstName.sendKeys("Seyfullah" + Keys.ENTER);

        ////fill the lastname
        driver.findElement(By.name("lastname")).sendKeys("Merdan" + Keys.ENTER);

        ////check the gender
        driver.findElement(By.id("sex-0")).click();


        ////check the experience
        driver.findElement(By.id("exp-1")).click();

        ////fill the date
        driver.findElement(By.id("datepicker")).sendKeys("10/04/2010");


        ////choose your profession -> Automation Tester
        WebElement prf=driver.findElement(By.id("profession-1"));
        prf.click();
        prf.sendKeys(Keys.PAGE_DOWN);

        ////choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();

        ////choose your continent -> Antartica
        driver.findElement(By.id("continents")).sendKeys("Afrika");

        ////choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();

        ////click submit button
        driver.findElement(By.id("submit")).click();



    }
}
