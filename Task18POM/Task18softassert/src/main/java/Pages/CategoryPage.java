package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage{

    public CategoryPage(WebDriver driver) {

        super(driver);
    }

    //locators
    By categoryText = By.xpath("//div[@class=\"left-sidebar\"] //h2[text()='Category']");
    By categoryTextCss = By.cssSelector("div[class=\"left-sidebar\"] >h2:nth-child(1)");
    By womenCategory = By.cssSelector("a[href=\"#Women\"]");
    By dressButton = By.cssSelector("a[href=\"/category_products/1\"]");
    By dressProductsText = By.cssSelector("h2[class=\"title text-center\"]");
    By menCategory = By.cssSelector("a[href=\"#Men\"]");
    By tShirtsButton = By.cssSelector("a[href=\"/category_products/3\"]");
    By tShirtsProductsText = By.cssSelector("h2[class=\"title text-center\"]");

    //Methods
    public String getCategoryText(){
        return  returnText(categoryText);
    }
    public void clickWomenCategory(){
        click(womenCategory);
    }
    public void clickDressButton(){
        click(dressButton);
    }
    public String getDressProductsText(){
        return returnText(dressProductsText);
    }
    public  void clickMenCategory(){
        click(menCategory);
    }
    public void clickTShirtsButton(){
        click(tShirtsButton);
    }
    public String getTShirtsProductsText(){
        return  returnText(tShirtsProductsText);
    }









}

