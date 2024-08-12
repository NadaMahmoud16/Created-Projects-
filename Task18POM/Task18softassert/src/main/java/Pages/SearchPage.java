package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By goToProducts = By.cssSelector("a[href=\"/products\"]");
    By allProductsText = By.cssSelector("h2[class=\"title text-center\"]");
    By searchInput = By.cssSelector("input[id=\"search_product\"]");
    By searchButton = By.cssSelector("button[id=\"submit_search\"]");
    By searchedProductsText = By.cssSelector("h2[class=\"title text-center\"]");
    By blueTopProductText = By.cssSelector("div[class=\"productinfo text-center\"] p");
    By addToCartButton = By.cssSelector("a[class=\"btn btn-default add-to-cart\"]");
    By continueShopping = By.cssSelector("button[class=\"btn btn-success close-modal btn-block\"]");
    By CartButton = By.cssSelector("a[href=\"/view_cart\"] i[class=\"fa fa-shopping-cart\"]");
    By blueTopProductInCart = By.cssSelector("a[href=\"/product_details/1\"]");
    By signUp_Login =  By.cssSelector("a[href=\"/login\"]");
    By loginEmailInput = By.cssSelector("input[data-qa=\"login-email\"]");
    By loginPasswordInput = By.cssSelector("input[data-qa=\"login-password\"]");
    By loginButton = By.cssSelector("button[data-qa=\"login-button\"]");

    //Methods
    public void clickGoToProducts(){
        click(goToProducts);
    }
    public String getAllProductsText(){
        return returnText(allProductsText);
    }
    public void writeInSearchInput(){
        write(searchInput, "Blue Top");
    }
    public void clickSearchButton(){
        click(searchButton);
    }
    public String getSearchedProductsText(){
        return returnText(searchedProductsText);
    }
    public String getBlueTopProductText(){
        return returnText(blueTopProductText);
    }
    public void clickAddToCartButton(){
        click(addToCartButton);
    }
    public void clickContinueShopping(){
        click(continueShopping);
    }
    public void clickCartButton(){
        click(CartButton);
    }
    public String getBlueTopProductInCart(){
        return returnText(blueTopProductInCart);
    }
    public void clickSignUp_Login(){
        click(signUp_Login);
    }
    public void writeLoginEmailInput(String email){
        write(loginEmailInput, email);
    }
    public void writeLoginPasswordInput(String password){
        write(loginPasswordInput, password);
    }
    public void clickLoginButton(){
        click(loginButton);
    }

}

