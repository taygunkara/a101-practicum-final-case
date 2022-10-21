package hepsiburada.cart;


import hepsiburada.BaseTest;
import org.testng.Assert;
import pages.home.HomePage;
import pages.login.LoginPage;
import org.testng.annotations.Test;


public class CartPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;



    @Test(priority = 0, description = "Adding product to cart by logging in first." +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithLogin(){

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.goToLoginPage();
        loginPage.getLogin();
        homePage.acceptCookies();
        Assert.assertEquals("Hesabım",
                "Hesabım");


        homePage.searchBox().search();



    }


    @Test(priority = 1, description = "Adding a product to the cart without logging in, " +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithoutLogin(){

    }


}
