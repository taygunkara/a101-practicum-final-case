package hepsiburada.cart;


import hepsiburada.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import pages.cart.CartPage;
import pages.home.HomePage;
import pages.login.LoginPage;
import org.testng.annotations.Test;
import pages.product.ProductPage;
import pages.search.ProductsPage;


public class CartPageTest extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private ProductPage productPage;
    private CartPage cartPage;

    final String expectedProductName = "TCL 30 Plus 128 GB 4 GB Ram (TCL Türkiye Garantili)";

    /**
     * Initialize the drivers.
     */
    public void initDrivers(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    /**
     * Function made for common steps.
     * 1- Search desired product name.
     * 2- Select first product from results.
     * 3- Transferring the driver to the new tab.
     * 4- Add products to cart from two different mercents.
     * 5- Go to cart page from product page.
     */
    public void searchAndAddProductToCart(){
        homePage.searchBox().search();
        productsPage.selectFirstProduct();
        productPage.changeWindowTab();
        productPage.productAddToCart();
        productPage.goToCartPage();
    }

    @Test(priority = 1, description = "Adding product to cart by logging in first." +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithLogin(){

        initDrivers();
        homePage.acceptCookies();
        homePage.goToLoginPage();
        loginPage.getLogin();
        Assert.assertTrue(homePage.isLoggedIn(),
                "Login failed.");
        Reporter.log("Login successful.");


        searchAndAddProductToCart();

        Assert.assertTrue(expectedProductName.equals(cartPage.getFirstProductName()) ||
               expectedProductName.equals(cartPage.getSecondProductName()),
                "The product names do not match.");
        Reporter.log("The product names match.");

        cartPage.removeProducts();

    }


    @Test(priority = 2, description = "Adding a product to the cart without logging in, " +
            "then verifying the product by going to the cart.")
    public void addProductToCartWithoutLogin(){

        initDrivers();
        homePage.acceptCookies();

        searchAndAddProductToCart();

        Assert.assertTrue(expectedProductName.equals(cartPage.getFirstProductName()) ||
                        expectedProductName.equals(cartPage.getSecondProductName()),
                "The product names do not match.");
        Reporter.log("The product names match.");

    }

}
