package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import java.time.Duration;
import java.util.List;


public class ParentClass {

    protected    WebDriver driver;
    protected    WebDriverWait wait;

    public ParentClass(){
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public void clickTo(By locater){
        wait.until(ExpectedConditions.elementToBeClickable(locater)).click();
    }


    public void sendKeysTo(By locater, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locater)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locater)).sendKeys(text);
    }


    public void waitFor(By locater, WaitConditions waitConditions){
        switch (waitConditions){
            case exist:
                wait.until(ExpectedConditions.presenceOfElementLocated(locater));
                break;
            case clickable:
                wait.until(ExpectedConditions.elementToBeClickable(locater));
                break;
            case visible:
                wait.until(ExpectedConditions.visibilityOfElementLocated(locater));
                break;
            case invisible:
                wait.until(ExpectedConditions.invisibilityOfElementLocated(locater));
        }
    }


    public void scrollLocator(By locator){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(locator));
    }


    @AfterSuite
    public void afterSuite(){
        Driver.quitDriver();
    }


}