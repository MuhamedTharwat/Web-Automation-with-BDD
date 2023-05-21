package utilis;

import base.BaseClass;
import org.openqa.selenium.By;

public class Action extends BaseClass {
    public void click(By element) {
        driver.findElement(element).click();
    }

    public void type(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }
    public String getElementText (By element){
        return driver.findElement(element).getText();
    }
}
