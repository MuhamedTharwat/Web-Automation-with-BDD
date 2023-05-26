package StepDefinitions;

import base.BaseClass;
import com.nop.pages.HomePage;
import com.nop.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Register_StepDefs  {
    HomePage homePageObj = new HomePage();
    RegisterPage registerPageObj = new RegisterPage();
    @Given("user is on register page")
    public void userIsOnRegisterPage() {
        homePageObj.clickOnRegisterBtn();
    }

    @Given("user enter valid credentials {string} {string} {string} {string}")
    public void userEnterValidCredentials(String arg0, String arg1, String arg2, String arg3) {
        registerPageObj.fillRequiredFields(arg0,arg1,arg2,arg3);
    }

    @When("click on register button")
    public void clickOnRegisterButton() {
        registerPageObj.clickOnRegisterBtn();
    }

    @Then("verify Email Already exist message {string}")
    public void userDirectedToProfilePageSuccessfully(String arg0) {
        String result= registerPageObj.getEmailAlreadyExistMsg();
        Assert.assertTrue(result.contains(arg0));
    }

    @Then("verify register completed message {string}")
    public void verifyRegisterCompletedMessage(String arg0) {
        String result = registerPageObj.getRegisterCompletedMsg();
        Assert.assertTrue(result.contains(arg0));
    }


    @Then("verify {string} Required message {string}")
    public void verifyRequiredMessage(String arg0, String arg1) {
        if(arg0.contains("First Name")) {
            String result = registerPageObj.getFirstNameRequiredMsg();
            Assert.assertTrue(result.contains(arg1));
        }
        if(arg0.contains("Last Name")) {
            String result = registerPageObj.getLastNameRequiredMsg();
            Assert.assertTrue(result.contains(arg1));
        }
        if(arg0.contains("Password")) {
            String result = registerPageObj.getPasswordRequiredMsg();
            Assert.assertTrue(result.contains(arg1));
        }
    }
}
