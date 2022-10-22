package pages.cart;

import pages.BasePage;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }


    public String getFirstProductName() {
        return getText(locator);
    }

    public String getSecondProductName() {
        return getText(locator);
    }
}
