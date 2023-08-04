package Day_03_;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _02_Exercise2 extends BaseDriver {

    @Test
    void validateMenu() {
        login();

        List<WebElement> menuOptions = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        //List<String>menuText=new ArrayList<>(List.of("Desktops", "Laptops & Notebooks", "Components", ""));
        List<String> menuText = new ArrayList<>(List.of("Desktops", "Laptops & Notebooks", "Components",
                "Tablets", "Software", "Phones & PDAs", "Cameras", "MP3 Players"));

        for (WebElement m : menuOptions) {
            Assert.assertTrue(menuText.contains(m.getText()));
            Assert.assertTrue(m.isDisplayed());
        }

    }


}
