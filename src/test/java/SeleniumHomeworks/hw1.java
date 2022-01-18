package SeleniumHomeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {

    public static void main(String[] args) {

    /*   Question1
        1.https://www.youtube.com sayfasına gidin
        2.Title i consolda yazdirin
        3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yzdirin”
        4.Sayfayi kapatin
        5.Tum sayfalari kapatin
        6.Consola “Test completed” yazdirin   */


        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // 1.
        driver.get("https://www.youtube.com");
        //2.
        System.out.println(driver.getTitle());

        //3.

        String actuelTitle=driver.getTitle();
        String exceptedResult="YouTube";

        if (actuelTitle.equals(exceptedResult)) {
            System.out.println("correct title");
        } else {
            System.out.println("incorrect title");
        }

        //4.

        driver.close();

        // 5.

        driver.quit();

        // 6.

        System.out.println("Test Completed");



    }
}
