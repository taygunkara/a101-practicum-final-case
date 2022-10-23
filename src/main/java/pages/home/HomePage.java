package pages.home;

import org.openqa.selenium.By;
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

    By signInHoverLocator = By.xpath("//span[@data-test-id='account']");
    By signInButtonLocator = By.xpath("//a[@id='login']");
    By acceptCookiesButtonLocator = By.xpath("//button[@id='onetrust-accept-btn-handler']");
    By myAccountLocator = By.xpath("//a[@title='Hesabım']");

    public void goToLoginPage() {
        mouseMovement(signInHoverLocator);
        clickElement(signInButtonLocator);
    }

    public void acceptCookies() {
        clickElement(acceptCookiesButtonLocator);
    }

    public boolean isLoggedIn() {
        return isDisplayed(myAccountLocator);
    }
}
