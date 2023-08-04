package Day_07_;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class _05_WishListTest extends ParameterDriver {


    @Test
    @Parameters("searchKeyword")
    void wishListTest(String searchKeyword) {
        login();

        _02_PlaceOrderElements plc = new _02_PlaceOrderElements();

        plc.searchBox.sendKeys(searchKeyword);
        plc.searchClick.click();

        _06_WishListTestElements wishList = new _06_WishListTestElements();

        int randomIndex = (int) (Math.random() * wishList.wishListButtons.size());

        wishList.wishListButtons.get(randomIndex).click();

        String productName = wishList.productTitles.get(randomIndex).getText();

        wishList.wishListIcon.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@class='text-left']//a)[2]")));

        //Assert.assertEquals(wishList.productNameOnWishList.getText(), productName);


    }



}
