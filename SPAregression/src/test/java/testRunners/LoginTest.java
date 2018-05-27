package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ={"src/test/resources/features/login/Login.feature","src/test/resources/features/logout/Logout.feature"} ,glue = {"steps.login"})
public class LoginTest {
}