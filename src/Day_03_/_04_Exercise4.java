package Day_03_;

import Utilities.BaseDriver;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class _04_Exercise4 extends BaseDriver {

    @Test
    void addAdressTest(){
        login();

        WebElement adressBook=driver.findElement(By.xpath("//ul//a[text()='Address Book']"));
        adressBook.click();

        WebElement newAdress=driver.findElement(By.xpath("//a[text()='New Address']"));
        newAdress.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Eda");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Yalcin");

        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("Tesla");

        WebElement adress1=driver.findElement(By.id("input-address-1"));
        adress1.sendKeys("sffdfdfdsd ldfldf");

        WebElement postCode=driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("AYdin");

        WebElement country=driver.findElement(By.id("input-country"));
        Select countrys=new Select(country);
        countrys.selectByVisibleText("Turkey");

        WebElement State=driver.findElement(By.id("input-zone"));
        Select cities=new Select(State);
        cities.selectByValue("3321");

        WebElement clickContinue=driver.findElement(By.xpath("//input[@value='Continue']"));
        clickContinue.click();



        //WebElement editAdress=driver.findElement(By.xpath("//a[@class='btn btn-info']"));
        //editAdress.click();

        //WebElement deleteAdress=driver.findElement(By.xpath("//a[@class='btn btn-danger']"));
        //deleteAdress.click();




    }
    @Test(priority = 1,dependsOnMethods = "addAdressTest")
    void editAdressTest(){
        //login();

        WebElement adressBook=driver.findElement(By.xpath("//ul//a[text()='Address Book']"));
        adressBook.click();

        WebElement editAdress=driver.findElement(By.xpath("//a[@class='btn btn-info']"));
        editAdress.click();

        WebElement city=driver.findElement(By.id("input-city"));
        city.clear();
        city.sendKeys("Ankara");

        WebElement State=driver.findElement(By.id("input-zone"));
        Select cities=new Select(State);
        cities.selectByValue("3333");

        WebElement clickContinue=driver.findElement(By.xpath("//input[@value='Continue']"));
        clickContinue.click();

    }

    @Test(priority = 2,dependsOnMethods = "addAdressTest")
    void deleteAdressTest(){
        //login();

       // WebElement adressBook=driver.findElement(By.xpath("//ul//a[text()='Address Book']"));
       // adressBook.click();

        WebElement deleteAdress=driver.findElement(By.xpath("//a[@class='btn btn-danger']"));
        deleteAdress.click();


    }


}
