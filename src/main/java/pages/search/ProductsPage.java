package pages.search;

import org.openqa.selenium.By;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Represents the products page (searched - result page).
 */
public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By firstProductLocator = By.xpath("//*[@id='i0']");

    /**
     * Go inside the first product in the results.
     */
    public void selectFirstProduct() {
        clickElement(firstProductLocator);
    }
}
