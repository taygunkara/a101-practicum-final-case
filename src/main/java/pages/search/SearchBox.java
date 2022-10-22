package pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SearchBox extends BasePage {
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    By searchBoxLocator = By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']");
    By searchButtonLocator = By.cssSelector(".SearchBoxOld-cHxjyU99nxdIaAbGyX7F");

    private final String searchingProductName = "Cep Telefonu";

    public void search() {
        type(searchBoxLocator, searchingProductName);
        clickElement(searchButtonLocator);
    }
}
