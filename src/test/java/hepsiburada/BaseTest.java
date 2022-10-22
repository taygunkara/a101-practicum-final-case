package hepsiburada;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;
    private final String BASE_URL = "https://www.hepsiburada.com/";

    @BeforeTest
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
    }

/*    @AfterTest
    public void tearDown(){
        driver.quit();
    }*/
}
