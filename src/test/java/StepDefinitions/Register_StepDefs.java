package StepDefinitions;

import base.BaseClass;
import com.nop.pages.HomePage;
import com.nop.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Register_StepDefs  {
    HomePage homePageObj = new HomePage();
    RegisterPage registerPageObj = new RegisterPage();
    @Given("user is on register page")
    public void userIsOnRegisterPage() {
        homePageObj.clickOnRegisterBtn();
    }

    @When("user enter valid credentials {string} {string} {string} {string}")
    public void userEnterValidCredentials(String arg0, String arg1, String arg2, String arg3) {
        registerPageObj.fillRequiredFields(arg0,arg1,arg2,arg3);
    }

    @And("click on register button")
    public void clickOnRegisterButton() {
        registerPageObj.clickOnRegisterBtn();
    }

    @Then("User Directed to profile page successfully")
    public void userDirectedToProfilePageSuccessfully() {
    }
}
