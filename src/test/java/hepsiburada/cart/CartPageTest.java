package hepsiburada.cart;


import hepsiburada.BaseTest;
import org.testng.Assert;
import pages.cart.CartPage;
import pages.home.HomePage;
import pages.login.LoginPage;
import org.testng.annotations.Test;
import pages.product.ProductPage;
import pages.search.ProductsPage;


public class CartPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    ProductPage productPage;
    CartPage cartPage;

    final String expectedProductName = "TCL 30 Plus 128 GB 4 GB Ram (TCL Türkiye Garantili)";

    public void initDrivers(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    public void commonSteps(){

        homePage.searchBox().search();
        productsPage.selectFirstProduct();
        productPage.changeWindowTab();
        productPage.productAddToCart();
        productPage.goToCartPage();
    }

    @Test(priority = 0, description = "Adding product to cart by logging in first." +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithLogin(){

        initDrivers();
        homePage.acceptCookies();
        homePage.goToLoginPage();
        loginPage.getLogin();
        Assert.assertTrue(homePage.isLoggedIn());

        commonSteps();
        Assert.assertTrue(expectedProductName.equals(cartPage.getFirstProductName()) ||
               expectedProductName.equals(cartPage.getSecondProductName()));

    }


    @Test(priority = 1, description = "Adding a product to the cart without logging in, " +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithoutLogin(){

        initDrivers();
        homePage.acceptCookies();
        commonSteps();

        Assert.assertTrue(expectedProductName.equals(cartPage.getFirstProductName()) ||
                expectedProductName.equals(cartPage.getSecondProductName()));

    }


}
