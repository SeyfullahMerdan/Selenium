package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ImplicitlyWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize(); // Bunu en başta her zaman yapmakta fayda var
        // bazı elementler bazen gözükmeyebilir bu yüzden mazimize yapmakta fayda var.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // implicitlywait testimiz boyunca sayfa açılması ve element bulunması konusunda driver'in bekleyecegi
        // maximum süreyi belirler. Bu süre içerisinde görevini bitirir bitirmez bir sonraki adıma geçer
        // Bu süre zarfında görevini bitiremezse o zaman hata verir.

        // Belirlenen max. süre Thread.sleep deki gibi mutlak bekleme süresi degildir. Görevi bitirdiyse 15.sn. yazdıysam
        // sonuna kadar beklemez, görevi bitirince yapıp geçer. Bitiremezse ama bekler...

        driver.get("https://techproeducation.com");

        Thread.sleep(5000); // Burada 5 saniye bekler, mutlaka bekler.

        driver.quit();








    }




}
