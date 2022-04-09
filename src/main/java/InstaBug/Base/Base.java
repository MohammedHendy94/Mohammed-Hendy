package InstaBug.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

    public static void launch_browser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://developers.facebook.com/docs/development/build-and-test/test-users");
        driver.findElement(By.xpath("//a[@class='_p47 lfloat _1k5h']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    public static void close_browser(){
        driver.quit();
    }


}
