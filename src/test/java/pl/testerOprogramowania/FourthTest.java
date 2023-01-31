package pl.testerOprogramowania;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FourthTest {
    // dependencies between tests

    @Test (dependsOnMethods = {"thirdTest"})
    public void firstTest() {
        System.out.println("I am first test");
    }

    @Test (dependsOnMethods = {"firstTest"})
    public void secondTest() {
        System.out.println("I am second test");
    }

    @Test
    public void thirdTest() {
        System.out.println("I am third test");

        String x = "I am third test";
//        Assert check real value, expected value
        Assert.assertEquals(x, "I am third test");

    }


}