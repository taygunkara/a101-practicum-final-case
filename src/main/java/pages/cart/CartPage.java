package pages.cart;

import org.openqa.selenium.By;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By firstProductNameLocator = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/a");
    By secondProductNameLocator = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[4]/div/ul/li/div/div/div[1]/div[2]/div[2]/a");

    public String getFirstProductName() {
        return getText(firstProductNameLocator);
    }

    public String getSecondProductName() {
        return getText(secondProductNameLocator);
    }
}
