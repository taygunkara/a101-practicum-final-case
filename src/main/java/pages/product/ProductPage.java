package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

/**
 * Represents the product page.
 */
public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCartFromFirstMercant = By.xpath("//button[@id='addToCart']");
    private final By addToCartFromSecondMercant = By.cssSelector(".marketplace-list > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > form:nth-child(1) > button:nth-child(15)");
    private final By myCartLocator = By.cssSelector("a.sf-OldMyAccount-MjrNQp_LLdAaN1g0xvSz");

    /**
     * Transferring the driver to the new tab after the new tab is opened.
     */
    public void changeWindowTab() {
        String currentWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            // System.out.println(currentWindow);
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
    }
    /**
     * Adding the product to the cart from two different mercants.
     */
    public void productAddToCart() {
        clickElement(addToCartFromFirstMercant);
        clickElement(addToCartFromSecondMercant);
    }

    /**
     * Go to cart page from product page.
     */
    public void goToCartPage() {
        clickElement(myCartLocator);
    }


}
