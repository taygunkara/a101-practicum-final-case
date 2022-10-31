package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.search.SearchBox;

/**
 * Represents the home page.
 */
public class HomePage extends BasePage {
    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }
    public SearchBox searchBox(){
        return this.searchBox;
    }

    By signInHoverLocator = By.xpath("//span[@data-test-id='account']");
    By signInButtonLocator = By.xpath("//a[@id='login']");
    By acceptCookiesButtonLocator = By.xpath("//button[@id='onetrust-accept-btn-handler']");
    By myAccountLocator = By.xpath("//a[@title='Hesabım']");

    /**
     * Go to the login page from the home page.
     */
    public void goToLoginPage() {
        mouseMovement(signInHoverLocator);
        clickElement(signInButtonLocator);
    }

    /**
     * Acceptance of cookies.
     */
    public void acceptCookies() {
        clickElement(acceptCookiesButtonLocator);
    }

    /**
     * Checking for successful login or not.
     */
    public boolean isLoggedIn() {
        return isDisplayed(myAccountLocator);
    }
}
