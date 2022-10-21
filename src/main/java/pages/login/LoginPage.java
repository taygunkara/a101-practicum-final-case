package pages.login;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void getLogin() {
        type(locator, "mail");
        clickElement(girişyapbutton);
        type(locator, "şifre");
        clickElement(girişyapbutton);
    }
}
