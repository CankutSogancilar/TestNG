package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParameterDriver {
    public static WebDriver driver=null;
    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void createParameteredDriver(String browserName){

        closePreviousDrivers();

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);


        if(browserName.equalsIgnoreCase("chrome")){
             driver=new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
             driver=new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("edge")){
             driver=new EdgeDriver();
        }

        driver.manage().window().maximize();

        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(duration);





    }

    @AfterClass(alwaysRun = true)
    public void quitDriver(){

        Tools.myWait(3);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public void login() {

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement eMail = driver.findElement(By.id("input-email"));
        eMail.sendKeys("ada@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();

        WebElement myAccountText = driver.findElement(By.xpath("//li//a[text()='My Account']"));

        //Assert.assertTrue(myAccountText.isDisplayed());
        //Assert.assertEquals(myAccountText.getText(),"My Account");

    }

    public void login(String username, String psswrd) {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys(username);

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys(psswrd);

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
    }
    public void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
