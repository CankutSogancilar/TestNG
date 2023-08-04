package Day_07_;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import Utilities.Tools;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.time.Duration;

public class _01_PlaceOrderTest extends BaseDriver {

    @Test(dataProvider = "keywordGenerator")
    void searchIpodTest(String keyword) {
        login();

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchBox.sendKeys(keyword);

        WebElement searchClick = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        searchClick.click();

        WebElement addToCartButton = driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]"));
        addToCartButton.click();

        WebElement shoppingCartButton = driver.findElement(By.xpath("//a[@title='Shopping Cart']"));
        shoppingCartButton.click();

        WebElement checkOutButton = driver.findElement(By.xpath("//span[text()='Checkout']"));
        checkOutButton.click();

        WebElement step2Cont = driver.findElement(By.xpath("//input[@id='button-payment-address']"));
        step2Cont.click();

        Tools.myWait(5);
        WebElement step3Cont = driver.findElement(By.xpath("//input[@id='button-shipping-address']"));
        step3Cont.click();

        WebElement step4Cont = driver.findElement(By.xpath("//input[@id='button-shipping-method']"));
        step4Cont.click();

        WebElement termsAndConditions = driver.findElement(By.xpath("//input[@name='agree']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(termsAndConditions));

        termsAndConditions.click();

        WebElement step5Cont = driver.findElement(By.xpath("//input[@id='button-payment-method']"));
        step5Cont.click();

        WebElement confirmOrder = driver.findElement(By.xpath("//input[@id='button-confirm']"));
        confirmOrder.click();

        WebElement orderHasBeenPlaced = driver.findElement(By.xpath("//h1[text()='Your order has been placed!']"));


        Assert.assertTrue(orderHasBeenPlaced.getText().contains("has been placed!"));


    }

    @DataProvider(name = "keywordGenerator")
    public Object[][] searchKeyword() {

        Object[][] keyword = {{"ipod"}
        };
        return keyword;


    }
}
