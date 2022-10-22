package pages.search;

import org.openqa.selenium.By;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By firstProductLocator = By.xpath("//*[@id='i0']");

    ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());

    public void selectFirstProduct() {
        clickElement(firstProductLocator);
    }
    public void switchNextWindow(){
        driver.switchTo().window(newTab.get(1));
    }
}
