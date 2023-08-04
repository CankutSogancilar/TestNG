package Day_02_;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Example extends BaseDriver {

    @Test
    public void loginTest() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement eMail=driver.findElement(By.id("input-email"));
        eMail.sendKeys("testngusbatch@gmail.com");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("usbatch1234");

        WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();

        WebElement myAccount=driver.findElement(By.xpath("//h2[text()='My Account']"));

       //Assert.assertTrue(myAccount.isDisplayed());
       Assert.assertEquals(myAccount.getText(),"My Account");

       //Assert.assertFalse("Test Failed",myAccount.getText().contains("Account"));
       // Assert.assertTrue("Test Failed",myAccount.getText().contains("Account"));
       // Assert.assertTrue("Test Failed",myAccount.getText().contains("Account"));








    }


}
