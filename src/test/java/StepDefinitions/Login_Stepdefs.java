package StepDefinitions;

import com.nop.pages.HomePage;
import com.nop.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Login_Stepdefs {
    HomePage homePageObj = new HomePage();
    LoginPage loginPageObj = new LoginPage();
    @Given("user is on login page")
    public void userIsOnLoginPage(){
        homePageObj.clickOnLoginBtn();
    }

    @Given("user enter valid credentials {string} {string}")
    public void userEnterValidCredentials(String arg0, String arg1) {
        loginPageObj.setEmailTxtBox(arg0);
        loginPageObj.setPasswordTxtBox(arg1);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        loginPageObj.clickOnLoginBtn();
    }

    @Then("user is logged in and logout button appeared")
    public void userIsLoggedInAndLogoutButtonAppeared() {
        Assert.assertTrue(homePageObj.logOutButtonExist());
    }
}
