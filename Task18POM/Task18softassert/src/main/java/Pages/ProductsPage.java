package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By goToProductsPage = By.cssSelector("a[href=\"/products\"]");
    By brandsDisplayed = By.cssSelector("div[class=\"brands_products\"] h2");
    By poloBrandName = By.cssSelector("a[href=\"/brand_products/Polo\"]");
    By brandPoloProducts = By.cssSelector("h2[class=\"title text-center\"]");
    By hmBrandName = By.cssSelector("a[href=\"/brand_products/H&M\"]");
    By brandHmProducts = By.cssSelector("h2[class=\"title text-center\"]");

    //Methods
    public void clickGoToProductsPage(){
        click(goToProductsPage);
    }
    public String getBrandsDisplayed(){
        return returnText(brandsDisplayed);
    }
    public void clickPoloBrandName(){
        click(poloBrandName);
    }
    public String getBrandPoloProducts(){
        return  returnText(brandPoloProducts);
    }
    public void clickHmBrandName(){
        click(hmBrandName);
    }
    public String getBrandHmProducts(){
        return  returnText(brandHmProducts);
    }

}



