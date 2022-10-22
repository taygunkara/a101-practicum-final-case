package pages.search;

import pages.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());

    public void selectFirstProduct() {
        clickElement(urunlocator);
    }
    public void switchNextWindow(){
        driver.switchTo().window(newTab.get(1));
    }
}
