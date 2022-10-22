package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By addToCartFirstProduct;
    By addToCartSecondProduct;
    By closePopUpLocator;
    By myCartLocator;

    public void productAddToCart() {
        // for ile yapabilir miyiz ?
        clickElement(addToCartFirstProduct);
        clickElement(closePopUpLocator);
        clickElement(addToCartSecondProduct);
        clickElement(closePopUpLocator);
    }

    public void goToCartPage() {
        clickElement(myCartLocator);
    }

}
