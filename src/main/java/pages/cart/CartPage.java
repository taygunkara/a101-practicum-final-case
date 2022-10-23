package pages.cart;

import org.openqa.selenium.By;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By firstProductNameLocator = By.xpath("//h1[@id='product-name']");
    By secondProductNameLocator = By.xpath("//h1[@id='product-name']");

    By firstMercantNameLocator;
    By secondMercantLocator;


    public String getFirstProductName() {
        return getText(firstProductNameLocator);
    }

    public String getSecondProductName() {
        return getText(secondProductNameLocator);
    }
}
