package Day_02_;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_SignUpTest extends BaseDriver {

    @Test
    void signUpTest(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement myAcc=driver.findElement(By.xpath("//span[text()='My Account']"));
        myAcc.click();

        WebElement register=driver.findElement(By.xpath("//li//a[text()='Register']"));
        register.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Cankut");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Sogancilar");

        WebElement eMail=driver.findElement(By.id("input-email"));
        eMail.sendKeys("cankutsogancilar2@gmail.com");

        WebElement telephone=driver.findElement(By.id("input-telephone"));
        telephone.sendKeys("40758454745");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        WebElement passwordConfirm=driver.findElement(By.id("input-confirm"));
        passwordConfirm.sendKeys("123456");

        WebElement policy=driver.findElement(By.xpath("//input[@name='agree']"));
        policy.click();

        WebElement continueButton=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        continueButton.click();

        WebElement congrats=driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"));

        Assert.assertEquals("Congratulations! Your new account has been successfully created!",congrats.getText(),"They Are Not Equal");


    }
}
