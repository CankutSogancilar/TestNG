package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Tools {

    public static void successMessageValidation(){
        WebElement checkText = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(checkText.getText().contains("Success: Your newsletter subscription has been successfully updated!"));
    }
    public static void myWait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
