package Day_03_;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Exercise extends BaseDriver {

    @Test
    void updateNameTest(){
        login();

        editName("Eda");
        editName("Cankut");

    }
    void editName(String name){

        WebElement eAcc=driver.findElement(By.xpath("//li//a[text()='Edit Account']"));
        eAcc.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(name);

        WebElement clickC=driver.findElement(By.xpath("//input[@value='Continue']"));
        clickC.click();

        WebElement successMessage=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));

        Assert.assertTrue(successMessage.getText().contains("successfully updated"));


    }

}
