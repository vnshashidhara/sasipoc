package steps.login;

import com.pages.FollettSpa;
import com.pages.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinitions {
    FollettSpa follettSpa;
    Loginpage loginpage;
    

    @Given("^(.*) is user accesing the portal$")
    public void openPortal(String user) throws Throwable {
        follettSpa.open();
     }

    @When("^(.*) try logging into the portal using password (.*)$")
    public void loginIntoThePortal(String userName, String password) throws Throwable {

        loginpage.verifyIfPageLoaded();
        loginpage.login(userName,password);
    }

    @Then("^He should be Logged in$")
    public void loginVerification() throws Throwable {
        
    }

    @Then("^He shouldn't be Logged in$")
    public void invalidLoginVerification() throws Throwable {
        loginpage.verifyIfPageLoaded();
        loginpage.verifyIfErrorMessageIsDisplayed();
    }

    @Given("^(.*) is logged into the application$")
    public void loginIntoThePortal(String user) throws Throwable {
        follettSpa.open();
        loginIntoThePortal(user,"Skywalker");
        
    }

    @Then("^He try to Logout of the application$")
    public void logout() throws Throwable {
        
    }

    @Then("^He should land on Login view$")
    public void verifyHomePageisLaoded() throws Throwable {
        loginpage.verifyIfPageLoaded();
    }
}
