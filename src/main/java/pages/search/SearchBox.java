package pages.search;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SearchBox extends BasePage {
    public SearchBox(WebDriver driver) {
        super(driver);
    }


    public void search() {
        type(locator, aranankelime);
        clickElement(aramabutonu);
    }
}
