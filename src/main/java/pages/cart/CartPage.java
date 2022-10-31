package pages.cart;

import org.openqa.selenium.By;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Represents the cart page.
 */
public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By firstProductNameLocator = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/a");
    By secondProductNameLocator = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[4]/div/ul/li/div/div/div[1]/div[2]/div[2]/a");
    By firstProductCleanButtonLocator = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[3]/div/ul/li/div/div/div[1]/div[2]/div[4]/div[2]/div/a[2]");
    By secondProductCleanButtonLocator = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[4]/div/ul/li/div/div/div[1]/div[2]/div[4]/div[2]/div/a[2]");

    /**
     * Get first product name.
     */
    public String getFirstProductName() {
        return getText(firstProductNameLocator);
    }

    /**
     * Get second product name.
     */
    public String getSecondProductName() {
        return getText(secondProductNameLocator);
    }

    /**
     * Clean to cart.
     */
    public void removeProducts() {
        clickElement(firstProductCleanButtonLocator);
        clickElement(secondProductCleanButtonLocator);
    }
}
