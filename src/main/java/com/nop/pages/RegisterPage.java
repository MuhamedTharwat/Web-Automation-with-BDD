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
}
