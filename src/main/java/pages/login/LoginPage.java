package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

/**
 * Represents the login page.
 */
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By emailBoxLocator = By.xpath("//input[@id='txtUserName']");
    // sign in button = emailConfirmButton
    By emailConfirmButtonLocator = By.xpath("//button[@id='btnLogin']");
    By passwordBoxLocator = By.xpath("//input[@id='txtPassword']");
    // sign in button = passwordConfirmButton
    By passwordConfirmButtonLocator = By.xpath("//button[@id='btnEmailSelect']");

    final String email = "tk_testing_mail@proton.me";
    final String password = "Testingpassword1";

    /**
     * Fill in the e-mail information with the defined email.
     */
    public void setEmail(){
        type(emailBoxLocator, email);
        clickElement(emailConfirmButtonLocator);
    }
    /**
     * Fill in the password information with the defined password.
     */
    public void setPassword(){
        type(passwordBoxLocator, password);
        clickElement(passwordConfirmButtonLocator);
    }
    /**
     * Log in with the defined e-mail and passport.
     */
    public void getLogin() {
        setEmail();
        setPassword();
    }


}
