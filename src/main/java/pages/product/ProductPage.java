package pages.product;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public void productAddToCart() {
        // for ile yapabilir miyiz ?
        clickElement(1.sepeteekle);
        clickElement(popuplocator);
        clickElement(2.sepeteekle);
        clickElement(popuplocator);
    }

    public void goToCartPage() {
        clickElement(sepetimlocator);
    }

}
