package Day_03_;

import Utilities.BaseDriver;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _03_Exercise3 extends BaseDriver {


    @Test(priority = 1,groups = "SmokeTest")
     void subscribeNewsLetterTest() {
        login();

        WebElement newsLetter = driver.findElement(By.xpath("//div[@id='content']//a[text()='Newsletter']"));
        newsLetter.click();

        WebElement clickYes = driver.findElement(By.xpath("//input[@value='1']"));
        clickYes.click();

        WebElement continueClick = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueClick.click();

       // WebElement checkText = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        //Assert.assertTrue(checkText.getText().contains("Success: Your newsletter subscription has been successfully updated!"));
        //driver.quit();------> ??

        Tools.successMessageValidation();

    }

    @Test(priority = 2,dependsOnMethods = "subscribeNewsLetterTest")
    void unsubscribeNewsLetterTest() {

        //login(); ------>??

        WebElement newsLetter = driver.findElement(By.xpath("//div[@id='content']//a[text()='Newsletter']"));
        newsLetter.click();

        WebElement clickNo = driver.findElement(By.xpath("//input[@value='0']"));
        clickNo.click();

        WebElement continueClick = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueClick.click();

        WebElement checkText = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));

        Assert.assertTrue(checkText.getText().contains("Success: Your newsletter subscription has been successfully updated!"));


        Tools.successMessageValidation();

    }
    @Test(priority = 3, dependsOnMethods ="subscribeNewsLetterTest")
    void switchNewsLetterSubscription(){


        WebElement newsLetter = driver.findElement(By.xpath("//div[@id='content']//a[text()='Newsletter']"));
        newsLetter.click();

        WebElement clickYes = driver.findElement(By.xpath("//input[@value='1']"));
        WebElement clickNo = driver.findElement(By.xpath("//input[@value='0']"));

        if(clickYes.isSelected()){
            clickYes.click();
        }else{
            clickNo.click();
        }

        WebElement continueClick = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueClick.click();

        Tools.successMessageValidation();





    }

}
