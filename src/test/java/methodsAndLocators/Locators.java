package methodsAndLocators;

import org.openqa.selenium.By;

public interface Locators {
    By lLoginButton = By.cssSelector("button[id='btnMyAccount']");
    By lInnerLoginButton=By.xpath("//a[text()='Giriş Yap']");
    By lInputEmail=By.cssSelector("input[id='email']");
    By lInputPassword=By.cssSelector("input[id='pass']");
    By lLoginSubmitButton=By.cssSelector("button[id='login-button']");
    By lSearchInput=By.cssSelector("input[id='navbar-search-input']");
    By lProductNames=By.cssSelector("div[class='product-list product-list--list-page'] div[class='product-list__product-name']");
    By lPage2Button=By.xpath("(//ul[@class='pagination']/li)[2]/a");
    By lProductThird=By.xpath("(//a[@class='product-list__link'])[3]");
    By lFavIcon=By.cssSelector("a[id='fav_Icon']");
    By lProductInMyFavorite=By.cssSelector("div[class='basket-cart__product-name']");
    By lCloseButton=By.cssSelector("div[id='modal-favorite'] button[title='Close']");
    By lMyFavoritesButton=By.xpath("//a[text()='Favori Ürünlerim']");
    By lRemoveProductButton=By.cssSelector("i[class='icon-times-circle']");



}
