package com.nop.pages;

import org.openqa.selenium.By;
import utilis.Action;

public class HomePage {
    Action action = new Action() ;
    By registerBtn = By.xpath("//a[normalize-space()='Register']");

    public void clickOnRegisterBtn(){
        action.click(registerBtn);
    }
}
