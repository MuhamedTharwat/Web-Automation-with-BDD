package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyRegister extends BaseClass {
    @BeforeTest
    public void setup(){
        loadConfigurations();
        launchWeb();
    }
    @Test
    public void userCanRegister(){
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
    }
}
