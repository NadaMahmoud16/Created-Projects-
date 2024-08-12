package Tests;

import Pages.SearchPage;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchPageTest extends  BaseTest{

    SearchPage page;
    SoftAssert soft = new SoftAssert();
    Faker faker = new Faker();
    String email = "nadamahmoud@gmail.com";
    String password = "123456789";

    @Test
    public void TC_20(){
        reportTest = report.createTest("Search Page Test");
        SearchPage page = new SearchPage(driver);

        //Click on 'Products' button
        page.clickGoToProducts();
        reportTest.pass("The products button is clickable");

        //Verify user is navigated to ALL PRODUCTS page successfully
        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/products");
        reportTest.info("Thee Product page will be displayd");

        soft.assertEquals(page.getAllProductsText(), "ALL PRODUCTS");
        reportTest.pass(page.getAllProductsText()+ " is displayed");

        //Enter product name in search input and click search button
        page.writeInSearchInput();
        reportTest.info("Write down the first product Blue Top in search input");

        page.clickSearchButton();
        reportTest.info("The Blue Top product will be displayed");

        //Verify 'SEARCHED PRODUCTS' is visible
        soft.assertEquals(page.getSearchedProductsText(), "SEARCHED PRODUCTS");
        reportTest.info(page.getSearchedProductsText()+" is displayed");

        //Verify all the products related to search are visible
        soft.assertEquals(page.getBlueTopProductText(), "Blue Top");
        reportTest.warning("The searched product is the same with the entered name in the search");

        //Add those products to cart
        page.clickAddToCartButton();
        reportTest.pass("Add the same product to the cart");

        //Click 'Cart' button and verify that products are visible in cart
        page.clickContinueShopping();
        reportTest.info("Continue shopping button is clickable");

        page.clickCartButton();
        reportTest.pass("Click to cart button to check the products added to cart");

        soft.assertEquals(page.getBlueTopProductInCart(), "Blue Top");
        reportTest.info("Blue Top product should be displayed in Cart page");

        //Click 'Signup / Login' button and submit login details
        page.clickSignUp_Login();
        reportTest.pass("The login page will be displayed");

        page.writeLoginEmailInput(email);
        reportTest.info("User can write down in the email input");
        reportTest.warning("The entered email should be already already saved");

        page.writeLoginPasswordInput(password);
        reportTest.info("User can write down in the password input");
        reportTest.warning("The entered password should be already already saved");

        page.clickLoginButton();
        reportTest.pass("Login button will redirect you to Home page with your account");

        //Again, go to Cart page
        page.clickCartButton();
        reportTest.pass("Click to cart button to check the products added to cart after login");

        //Verify that those products are visible in cart after login as well
        soft.assertEquals(page.getBlueTopProductInCart(), "Blue Top");
        reportTest.info("Blue Top product should be displayed in Cart page after login");

        soft.assertAll();

    }
}
