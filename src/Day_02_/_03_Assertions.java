package Day_02_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    @Test
    void Test1() {
        String str1 = "John";
        String str2 = "John";

        Assert.assertEquals(str1, str2, "Test Failed"); // Checks if two values are same
    }

    @Test
    void Test2() {
        String str1 = "John";
        String str2 = "Johnd";

        Assert.assertEquals(str1, str2, "Test Failed"); // Checks if two values are same
    }

    @Test
    void Test3() {
        int num1 = 12;
        int num2 = 42;

        Assert.assertNotEquals(num1, num2, "They are not Equal"); // Checks they are not equal
    }

    @Test
    void Test4() {
        int num1 = 12;
        int num2 = 12;

        Assert.assertNotEquals(num1, num2, "They are not Equal"); // Checks they are not equal
    }

    @Test
    void Test5() {
        int num = 12;
        int num2 = 12;

        Assert.assertTrue(num == num2, "It is False"); //Checks if the boolean statement is true

    }

    @Test
    void Test6() {
        int num = 12;
        int num2 = 125;

        Assert.assertTrue(num == num2, "It is False"); //Checks if the boolean statement is true
    }

    @Test
    void Test7() {
        String str = "John";

        Assert.assertNull(str, "It is False"); //Checks if an object is null
    }

    @Test
    void Test8() {
        String str = null;

        Assert.assertNull(str, "It is null"); //Checks if an object is null
    }

    @Test
    void Test9() {

        Assert.fail("Test failed"); // It throws an exeption no matter what

    }
}
