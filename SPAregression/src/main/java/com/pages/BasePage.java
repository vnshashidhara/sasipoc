package com.pages;

import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class BasePage extends PageObject {

    public WebDriver driver;

    public WebDriver getDriver(){
        return driver = getDriver();
    }

    public void quitDriver(){
        driver.quit();
    }

    public void waitForElementToBeDisplayed(WebElement webElement){
        for(int waitCount=1;waitCount<6;waitCount++){
            try{
                waitFor(webElement);
            }catch(Exception e){
                //just created a wait loop where an element will be searched for 30 seconds after page is renderred
            }

        }
    }
}
