package com.nop.pages;

import org.openqa.selenium.By;
import utilis.Action;

public class HomePage {
    Action action = new Action() ;
    By registerBtn = By.xpath("//a[normalize-space()='Register']");
    By logInBtn = By.xpath("//a[normalize-space()=('Log in')]");
    By logOutBtn = By.xpath("//a[normalize-space()=('Log out')]");

    public void clickOnRegisterBtn(){
        action.click(registerBtn);
    }
    public void clickOnLoginBtn(){
        action.click(logInBtn);
    }
    public boolean logOutButtonExist(){
        return action.elementExist(logOutBtn);
    }
}
