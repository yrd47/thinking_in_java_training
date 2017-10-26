package chapter7.p129.exercise2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/10/26.
 */
public class YrdTest {

    @Test
    public void testOverrideScrubMethod() {
        Yrd yrd = new Yrd();
        yrd.scrub();
        Assert.assertEquals(yrd.toString(), "Cleanser Yrd.scrub() Detergent.scrub() scrub()");
    }

    @Test
    public void testAddSterilizeMethod() {
        Yrd yrd = new Yrd();
        yrd.sterilize();
        Assert.assertEquals(yrd.toString(), "Cleanser sterilize()");
    }
}
