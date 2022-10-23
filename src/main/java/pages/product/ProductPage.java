package pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By addToCartFromFirstMercant = By.xpath("//button[@id='addToCart']");
    By addToCartFromSecondMercant = By.xpath("/html/body/div[2]/main/div[3]/section[1]/div[4]/div/div[4]/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/td[3]/div/form/button");
    By myCartLocator = By.cssSelector("a.sf-OldMyAccount-MjrNQp_LLdAaN1g0xvSz");

    public void changeWindowTab() {
        String currentWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            System.out.println(currentWindow);
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
    }

    public void productAddToCart() {
        clickElement(addToCartFromFirstMercant);
        clickElement(addToCartFromSecondMercant);
    }

    public void goToCartPage() {
        clickElement(myCartLocator);
    }



}
