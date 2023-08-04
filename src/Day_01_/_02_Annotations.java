package Day_01_;

import org.testng.annotations.*;

public class _02_Annotations {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is working");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After method is working");
    }
    @BeforeClass()
        public void beforeClass(){
        System.out.println("Before Class is working");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class is working");
    }

    @Test
    public void Test1(){
        System.out.println("Test 1 is successful");

    }
    @Test
    public void Test2(){
        System.out.println("Test 2 is successful");
    }

}
