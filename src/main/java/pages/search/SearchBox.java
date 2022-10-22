package pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SearchBox extends BasePage {
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    By searchBoxLocator;
    By searchButtonLocator;

    private final String searchingProductName = "";

    public void search() {
        type(searchBoxLocator, searchingProductName);
        clickElement(searchButtonLocator);
    }
}
