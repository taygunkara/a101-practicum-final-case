package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

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

    final String email = "@gmail.com";
    final String password = "";

    public void setEmail(){
        type(emailBoxLocator, email);
        clickElement(emailConfirmButtonLocator);
    }

    public void setPassword(){
        type(passwordBoxLocator, password);
        clickElement(passwordConfirmButtonLocator);
    }

    public void getLogin() {
        setEmail();
        setPassword();
    }


}
