package _10_FridayProject;

import Utilities.BaseDriver_FridayProject;
import Utilities.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.tools.Tool;

public class ActionsFridayProjects extends BaseDriver_FridayProject {
    Elements_FridayProjects elements=new Elements_FridayProjects();
    @Test
    public void LoginTest(){
        login();


    }
    @Test
    public void test2(){

        login();

        Tools.myWait(5);

        Elements_FridayProjects elements=new Elements_FridayProjects();

        elements.phones.click();

        elements.verifyPhone.click();

        elements.addToCart.click();

        Tools.myWait(5);

        BaseDriver_FridayProject.driver.switchTo().alert().accept();

        Tools.myWait(3);
        elements.goToCart.click();

        Tools.myWait(3);
        elements.placeOrder.click();

        Tools.myWait(3);

        elements.name.sendKeys("eda");

        elements.country.sendKeys("Turkey");

        elements.city.sendKeys("Ankara");

        elements.creditCard.sendKeys("1234568474");

        elements.month.sendKeys("04");

        elements.year.sendKeys("2023");

        elements.purchase.click();

        Assert.assertTrue(elements.amount.getText().contains("360"));
        Tools.myWait(3);
        Assert.assertTrue(elements.cardNumber.getText().contains("1234568474"));
        Tools.myWait(3);
        Assert.assertTrue(elements.name2.getText().contains("eda"));
        Tools.myWait(3);
        Assert.assertTrue(elements.date.getText().contains("4/7/2023"));

























    }
}
