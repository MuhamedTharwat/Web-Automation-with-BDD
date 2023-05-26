package com.nop.pages;

import base.BaseClass;
import org.openqa.selenium.By;
import utilis.Action;

public class RegisterPage extends BaseClass {
    Action action = new Action();
    By firstNameTxtBox = By.id("FirstName");
    By lastNameTxtBox = By.id("LastName");
    By emailTxtBox = By.id("Email");
    By passwordTxtBox = By.id("Password");
    By passwordConfirmTxtBox = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By registerCompletedMsg= By.xpath("//div[contains(text(),'Your registration completed')]");
    By emailAlreadyExistMsg= By.xpath("//div[contains(@class,'error validation')]//*[contains(text(),'The specified email already exists')]");
    By firstNameRequiredMsg= By.id("FirstName-error");
    By lastNameRequiredMsg= By.id("LastName-error");
    By passwordRequiredMsg= By.id("Password-error");
    public void fillRequiredFields(String fName,String lName,String email ,String password ){
        action.type(firstNameTxtBox,fName);
        action.type(lastNameTxtBox,lName);
        action.type(emailTxtBox,email);
        action.type(passwordTxtBox,password);
        action.type(passwordConfirmTxtBox,password);
    }
    public void clickOnRegisterBtn(){
        action.click(registerBtn);
    }
    public String getRegisterCompletedMsg(){
       return action.getElementText(registerCompletedMsg);
    }
    public String getEmailAlreadyExistMsg(){
        return action.getElementText(emailAlreadyExistMsg);
    }
    public String getFirstNameRequiredMsg(){
        return action.getElementText(firstNameRequiredMsg);
    }
    public String getLastNameRequiredMsg(){
        return action.getElementText(lastNameRequiredMsg);
    }
    public String getPasswordRequiredMsg(){
        return action.getElementText(passwordRequiredMsg);
    }


}
