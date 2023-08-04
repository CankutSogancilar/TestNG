package Day_01_;

import org.testng.annotations.Test;

public class _01_Intro {

    //With priority we can run our tests in the order we want (JUnit doesnt have this feature)
    // Without priority it runs the tests in alphabetic order
   @Test(priority = 1)
    public void loginTest(){
       System.out.println("Login Test is successful");

   }
   @Test(priority = 2)
    public void addToCartTest(){
       System.out.println("Add to Cart test is successful");

   }
   @Test(priority = 3)
    public void checkOutTest(){
       System.out.println("Check out test is successful");

   }




}
