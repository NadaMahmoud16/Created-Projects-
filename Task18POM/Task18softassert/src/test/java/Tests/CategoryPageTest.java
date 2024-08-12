package Tests;

import Pages.CategoryPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CategoryPageTest extends BaseTest{

    CategoryPage page;
    SoftAssert soft = new SoftAssert();

    @Test
    public void TC_18(){
        reportTest =report.createTest("Category Page Test");
        CategoryPage page = new CategoryPage(driver);

        //Navigate to url 'http://automationexercise.com'
        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/");
        reportTest.pass("The HomePage is visible");

        //Verify that categories are visible on left side bar
        soft.assertEquals(page.getCategoryText().toLowerCase(), "category");
        reportTest.pass("Category title is displayed");

        // Click on 'Women' category
        page.clickWomenCategory();
        reportTest.pass("Sub-category will be displayed");

        //Click on any category link under 'Women' category, for example: Dress
        page.clickDressButton();
        reportTest.pass("Dresses button is clickable and will redirect you to women dresses products");

        //Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        soft.assertEquals(page.getDressProductsText().toLowerCase(), "women - dress products");
        reportTest.pass(page.getDressProductsText()+" is displayed");

        //On left side bar, click on any sub-category link of 'Men' category
        page.clickMenCategory();
        reportTest.pass("Men category button is clickable");

        page.clickTShirtsButton();
        reportTest.pass("TShirts button is clickable and will redirect you to men TShirts products");

        //Verify that user is navigated to that category page
        soft.assertEquals(page.getTShirtsProductsText().toLowerCase(), "men -  tshirts products");
        reportTest.info(page.getTShirtsProductsText()+" is displayed");
        reportTest.fail("The actual result is not the expected result");
        reportTest.warning("Extra space is displayed");

        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/category_products/3");
        reportTest.pass("The sub-category selected page is displayed");

        soft.assertAll();


    }











}
