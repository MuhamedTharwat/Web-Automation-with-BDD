package com.nop.pages;

import org.openqa.selenium.By;
import utilis.Action;

public class LoginPage {
    Action action = new Action() ;
    By emailTxtBox = By.xpath("//input[@id='Email']");
    By passwordTxtBox = By.xpath("//input[@id='Password']");
    By loginBtn = By.xpath("//button[normalize-space()='Log in']");

    public void setEmailTxtBox(String email){
        action.type(emailTxtBox,email);
    }
    public void setPasswordTxtBox(String password){
        action.type(passwordTxtBox,password);
    }
    public void clickOnLoginBtn(){
        action.click(loginBtn);
    }

}
