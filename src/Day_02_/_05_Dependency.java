package Day_02_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Dependency {

    @Test
    void startEngine(){
        System.out.println("Engine is started");
  //      Assert.fail();
    }

    @Test(dependsOnMethods = "startEngine") // This test depends on startEngine test
    void driveCar(){
        System.out.println("Car is being driven");

        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startEngine","driveCar"}) //This test depends on both startEngine and Drive car tests
    void parkCar(){
        System.out.println("Car is parked");

    }
    @Test(dependsOnMethods = {"startEngine","driveCar","parkCar"}) //This test depends on both startEngine and Drive car tests
    void stopCar(){
        System.out.println("Car is stopped");

    }



}
