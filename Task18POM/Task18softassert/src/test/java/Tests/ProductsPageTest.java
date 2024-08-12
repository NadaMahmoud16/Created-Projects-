package Tests;

import Pages.BasePage;
import Pages.ProductsPage;
import com.aventstack.extentreports.model.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductsPageTest extends BaseTest {

    ProductsPage page;
    SoftAssert soft = new SoftAssert();

    @Test
    public void TC_19(){
        reportTest = report.createTest("Product Page Test");
        ProductsPage page = new ProductsPage(driver);

        //Navigate to url 'http://automationexercise.com'
        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/");
        reportTest.pass("The Home Page is displayed");

        // Click on 'Products' button
        page.clickGoToProductsPage();
        reportTest.pass("The Products page is displayed");

        // Verify that Brands are visible on left side bar
        soft.assertEquals(page.getBrandsDisplayed(), "BRANDS");
        reportTest.pass(page.getBrandsDisplayed()+ " is displayed on the left side bar");

        //Click on any brand name
        page.clickPoloBrandName();
        reportTest.pass("Polo Brand button is clickable and will redirect you to the polo products page");

        //Verify that user is navigated to brand page and brand products are displayed
        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/brand_products/Polo");
        reportTest.pass("User is navigated to Brand Name Page");

        soft.assertEquals(page.getBrandPoloProducts().toLowerCase() ,"brand - polo products");
        reportTest.pass(page.getBrandPoloProducts()+ " is displayed");

        //On left side bar, click on any other brand link
        page.clickHmBrandName();
        reportTest.pass("H&M Brand button is clickable and will redirect you to the H&M products page");

        //Verify that user is navigated to that brand page and can see products
        soft.assertEquals(page.getBrandHmProducts().toLowerCase(), "brand - h&m products");
        reportTest.pass(page.getBrandHmProducts()+ " is displayed");

        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/brand_products/H&M");
        reportTest.pass("User is navigated to Brand Name Page");

        soft.assertAll();

    }

}
