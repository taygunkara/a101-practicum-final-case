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

    private final String searchingProductName = "Cep Telefonu"; // TCL 30 Plus 128 GB 4 GB Ram (TCL Türkiye Garantili)

    public void search() {
        type(searchBoxLocator, searchingProductName);
        clickElement(searchButtonLocator);
    }
}
