import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.print.attribute.standard.JobPriority;
import java.time.Duration;


public class BaseTest {

    public static WebDriver driver;


    public static WebDriverWait wdWait;

    public static Actions actions;

    public static JobPriority priority;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new Actions(driver);


    }


    @AfterTest
    public void tearDown() {
        //driver.quit();
        //driver.close();
    }



    @Test
    public void webmailMup () throws InterruptedException {
        driver.get("https://webmail.mup.gov.rs/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("user-id")).sendKeys("Nikola Golubovic");
        Thread.sleep(2000);
        driver.findElement(By.id("pw-id")).sendKeys("gobpk8780");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }








}



