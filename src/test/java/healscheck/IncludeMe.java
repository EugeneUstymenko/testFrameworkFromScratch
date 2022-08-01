package healscheck;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.HealsCheckSteps;

public class IncludeMe {

    @Test(description = "Heals check test example")
    public void includeMeTest(){
        HealsCheckSteps healsCheckSteps = new HealsCheckSteps();
        Assert.assertTrue(healsCheckSteps.checkLoginAndPassword("qwertyu", "asdfgh"));
        Assert.assertTrue(healsCheckSteps.checkLoginAndPassword("foo", "bar"));
    }
}
