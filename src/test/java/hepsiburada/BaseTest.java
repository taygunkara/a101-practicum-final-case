package hepsiburada;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.*;

public class BaseTest {
    public WebDriver driver;
    private final String BASE_URL = "https://www.hepsiburada.com/";

    @BeforeMethod
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get(BASE_URL);
        // driver.manage().window().maximize();
        Reporter.log("The browser opened successfully.");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
        Reporter.log("The browser was successfully closed.");
    }
}
