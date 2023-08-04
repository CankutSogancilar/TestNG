package Day_07_;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _04_PlaceOrderTestWithPOM extends ParameterDriver {

    @Test
    void placeOrderTest(){
        login();

        _02_PlaceOrderElements elements=new _02_PlaceOrderElements();
        elements.searchBox.sendKeys("ipod");
        elements.searchClick.click();
        elements.addToCartButton.click();
        elements.shoppingCartButton.click();
        elements.checkOutButton.click();
        elements.step2Cont.click();
        elements.step3Cont.click();
        elements.step4Cont.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(elements.termsAndConditions));
        elements.termsAndConditions.click();
        elements.step5Cont.click();
        elements.confirmOrder.click();
        elements.orderHasBeenPlaced.click();

        Assert.assertTrue(elements.orderHasBeenPlaced.getText().contains("has been placed!"));






    }

}
