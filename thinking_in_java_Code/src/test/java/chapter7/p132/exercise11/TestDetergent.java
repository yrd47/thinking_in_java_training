package chapter7.p132.exercise11;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/10/26.
 */
public class TestDetergent {

    @Test
    public void testDilute() {
        Detergent detergent = new Detergent();
        detergent.dilute();
        Assert.assertEquals(detergent.toString(), "Cleanser dilute()");
    }

    @Test
    public void testApply() throws Exception {
        Detergent detergent = new Detergent();
        detergent.apply();
        String expectOutput = "Cleanser apply()";
        Assert.assertEquals(detergent.toString(), expectOutput);
    }

    @Test
    public void testScrub() throws Exception {
        Detergent detergent = new Detergent();
        detergent.scrub();
        String expectOutput = "Cleanser scrub()";
        Assert.assertEquals(detergent.toString(), expectOutput);
    }

    @Test
    public void testFoam() throws Exception {
        Detergent detergent = new Detergent();
        detergent.foam();
        String expectOutput = "Cleanser Detergent.foam()";
        Assert.assertEquals(detergent.toString(), expectOutput);
    }

    @Test
    public void testAssemble() throws Exception {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        String expectOutput = "Cleanser dilute() apply() scrub() Detergent.foam()";
        Assert.assertEquals(detergent.toString(), expectOutput);
    }

}
