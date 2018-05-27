package com.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;

public class Loginpage extends BasePage {

    @FindBy(xpath="//button[contains(text(),'Login')]")
    public WebElement submitButton;

    @FindBy(xpath="//input[contains(@ng-model,'user.name')]")
    public WebElement userIdText;

    @FindBy(xpath="//input[contains(@ng-model,'user.password')]")
    public WebElement passwordText;

    @FindBy(css = ".error-message.ng-binding")
    public WebElement errorMessage;

    public void verifyIfPageLoaded(){
        waitForElementToBeDisplayed(submitButton);
        assertThat("Submit button is displayed",submitButton.isDisplayed());

    }

    public void login(String userName, String password){
        verifyIfPageLoaded();
        userIdText.sendKeys(userName);
        if(password!=""){
            passwordText.sendKeys(password);
        }
        submitButton.click();
    }

    public void verifyIfErrorMessageIsDisplayed(){
        assertThat("Error message is displayed","Invalid username or password!".equalsIgnoreCase(errorMessage.getText()));

    }

}
