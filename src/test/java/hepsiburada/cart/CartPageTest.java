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


    final String expectedProfileName = "";
    final String expectedProductName = "";



    @Test(priority = 0, description = "Adding product to cart by logging in first." +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithLogin(){

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);

        // homePage.acceptCookies();
        homePage.goToLoginPage();
        loginPage.getLogin();
       // Assert.assertEquals(expectedProfileName);


        homePage.searchBox().search();
        productsPage.selectFirstProduct();
        productsPage.switchNextWindow();
        productPage.productAddToCart();
        productPage.goToCartPage();

       // Assert.assertTrue(expectedProductName.equals(cartPage.getFirstProductName()) ||
       //         expectedProductName.equals(cartPage.getSecondProductName()));

    }


    @Test(priority = 1, description = "Adding a product to the cart without logging in, " +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithoutLogin(){

    }


}
