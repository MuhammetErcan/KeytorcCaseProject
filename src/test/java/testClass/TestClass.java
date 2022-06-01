package testClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import methodsAndLocators.HomepageAndMethods;

public class TestClass extends HomepageAndMethods {

    @Test(testName = "Go to homepage")
    public void test01(){
        goToHomePageMethod();
    }

    @Test(testName = "Login")
    public void test02(){
        loginMethod("saribeyaz838@gmail.com","saribeyaz838@");
    }

    @Test(testName = "Search Product")
    public void test03(){
        searchProduckMethod("samsung");
    }

    @Test(testName = "Go to page 2")
    public void test04(){
        goToPage2Method();
    }

    @Test(testName = "Add favorite")
    public void test05(){
        addFavoriteMethod();
    }

    @Test(testName = "remove favorite")
    public void test06(){
        removeFavoriteMethod();
    }




}
