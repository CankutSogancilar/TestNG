package Day_06_;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_SearchFunctionWithDataProviderParallelTest extends BaseDriver {

    @Test(dataProvider = "searchKeyword",dataProviderClass = _04_SearchFunctionWithDataProvider.class)
    void SearchFunctionTest(String searchKeyword) {


        if(searchKeyword.equalsIgnoreCase("mac")){
            login();
        }


        WebElement search = driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
        search.clear();
        search.sendKeys(searchKeyword);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> results = driver.findElements(By.cssSelector("div[class='caption'] a"));

        for (WebElement e : results) {
            Assert.assertTrue(e.getText().toLowerCase().contains(searchKeyword));
        }


    }



}
