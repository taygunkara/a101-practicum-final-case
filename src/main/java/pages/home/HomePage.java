package pages.home;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.search.SearchBox;

public class HomePage extends BasePage {
    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public void goToLoginPage() {
        mouseMovement(signInButtonLocator);
        clickElement();
    }

    public void acceptCookies() {
        clickElement(acceptCookiesButtonLocator);
    }


}
