package Day_05_;

import Utilities.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunctionTestWithDifferentBrowsers extends ParameterDriver {


    @Test
    @Parameters({"searchKeyword"})
    void searchFunctionTest(String searchKeyword){
        login();

        WebElement search=driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
        search.sendKeys(searchKeyword);

        WebElement searchButton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> results=driver.findElements(By.cssSelector("div[class='caption'] a"));

        for(WebElement e:results){
            Assert.assertTrue(e.getText().toLowerCase().contains(searchKeyword));
        }




    }

}
