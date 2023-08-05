package Utilities;

import _10_FridayProject.Elements_FridayProjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver_FridayProject {

    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void getDriver(){

        closePreviousDrivers();
        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver=new ChromeDriver();
        driver.manage().window().maximize();

        Duration duration=Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(duration);
        driver.manage().timeouts().pageLoadTimeout(duration);
    }

    @AfterClass
    public void quitDriver(){
        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }

    public void closePreviousDrivers(){
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void login(){
        driver.get("https://www.demoblaze.com/index.html");

        Tools.myWait(2);

        WebElement loginButton = driver.findElement(By.id("login2"));
        loginButton.click();
        Tools.myWait(2);

        WebElement userName = driver.findElement(By.id("loginusername"));
        userName.sendKeys("eda@gmail.com");

        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("123456");

        WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
        login.click();

        Tools.myWait(3);

        WebElement verification = driver.findElement(By.xpath("//h5[normalize-space()='$360']"));

        Assert.assertTrue(verification.isDisplayed());
        Assert.assertEquals(verification.getText(), "$360");

    }



}
