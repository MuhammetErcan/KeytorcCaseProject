package methodsAndLocators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ParentClass;
import utils.WaitConditions;

import java.util.List;
import java.util.Locale;

import static methodsAndLocators.Locators.*;

public class HomepageAndMethods extends ParentClass  {

    public void goToHomePageMethod(){
        String homePageUrl="https://www.vatanbilgisayar.com/";
        goToUrl(homePageUrl);
        Assert.assertEquals(driver.getCurrentUrl(),homePageUrl);
    }

    public void loginMethod(String username, String password){
        clickTo(lLoginButton);
        clickTo(lInnerLoginButton);
        sendKeysTo(lInputEmail,username);
        sendKeysTo(lInputPassword, password );
        clickTo(lLoginSubmitButton);
        Assert.assertEquals(driver.findElement(lLoginButton).getText(),"HESABIM");
    }

    public void searchProduckMethod(String productName){
        sendKeysTo(lSearchInput, productName+ Keys.ENTER);
        List<WebElement>productNamesList=driver.findElements(lProductNames);
        for (WebElement element : productNamesList) {
            Assert.assertTrue(element.getText().toLowerCase(Locale.ROOT).contains(productName.toLowerCase(Locale.ROOT)));
        }
    }

    public void goToPage2Method(){
        scrollLocator(lPage2Button);
        clickTo(lPage2Button);
        Assert.assertTrue(driver.getCurrentUrl().contains("page=2"));
    }

    public void addFavoriteMethod(){
        String productThirdName=driver.findElement(lProductThird).getText();
        clickTo(lProductThird);
        clickTo(lFavIcon);
        clickTo(lCloseButton);
        clickTo(lLoginButton);
        clickTo(lMyFavoritesButton);
        String productNameInMyFavorites=driver.findElement(lProductInMyFavorite).getText();
        Assert.assertEquals(productThirdName,productNameInMyFavorites);
    }

    public void removeFavoriteMethod(){
        clickTo(lRemoveProductButton);
        waitFor(lProductInMyFavorite, WaitConditions.invisible);
    }
}
