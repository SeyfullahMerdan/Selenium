package MySelfWorkSpaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_navigator {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.youtube.com.tr/");
            Thread.sleep(3000);
            driver.navigate().to("https://www.amazon.de/");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().forward();
            Thread.sleep(3000);
            driver.navigate().refresh();
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.close();

        }
    }