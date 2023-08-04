package Day_04_;

import org.testng.annotations.Test;

public class _03_Groups {

    @Test(groups = "SmokeTest")
    void Test1(){
        System.out.println("Test 1 is running");
    }
    @Test(groups = "RegressionTest")
    void Test2(){
        System.out.println("Test 2 is running");
    }
    @Test()
    void Test3(){
        System.out.println("Test 3 is running");
    }
    @Test(groups = "SmokeTest")
    void Test4(){
        System.out.println("Test 4 is running");
    }
    @Test(groups = "RegressionTest")
    void Test5(){
        System.out.println("Test 5 is running");
    }
    @Test(groups ={"SmokeTest", "RegressionTest"})
    void Test6(){
        System.out.println("Test 6 is running");
    }



}
