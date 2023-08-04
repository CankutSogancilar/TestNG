package Day_05_;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUsTest extends BaseDriver {

    @Test
    @Parameters("message")
    void contactUsTest(String message1){
       // driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        login();

        WebElement contactUs=driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement enquiry=driver.findElement(By.id("input-enquiry"));
        enquiry.sendKeys(message1);

        WebElement submit=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submit.click();

      // Assert.assertTrue(driver.getCurrentUrl().contains("success"),"Test Failed");

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));

    }
    @Test
    @Parameters({"message","username","password"})
    void contactUsTest2(String message1, String username, String password){
        login(username,password);
        WebElement contactUsButton = driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        WebElement contactUsMessage = driver.findElement(By.id("input-enquiry"));
        contactUsMessage.sendKeys(message1);

        WebElement submitButton = driver.findElement(By.cssSelector("input[value='Submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }


}
