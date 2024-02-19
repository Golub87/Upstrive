package Base;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;


public class BaseTestTeacher {

    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;


    public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException
    {
        //read json to string
        String jsonContent = 	FileUtils.readFileToString(new File(filePath),
                StandardCharsets.UTF_8);
        //String to HashMap- Jackson Databind
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });
        return data;
        //{map, map}

    }

    public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
        FileUtils.copyFile(source, file);
        return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";


    }

    @BeforeMethod
    public void setUp () throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("E:\\UpStriveGMBH\\src\\main\\resources\\testData.properties"));
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://web-staging.upstrivesystem.com");

    }

    @AfterMethod
    public void tearDown () {


       driver.quit();

    }






}
