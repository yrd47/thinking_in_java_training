package chapter7.p127.exercise1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/10/26.
 */
public class LazyInitializationTest {

    @Test
    public void testLazyInitialization() {
        LazyInitialization lazyInitialization = new LazyInitialization();
        Assert.assertEquals(lazyInitialization.toString(), "TestLazyInitialization");
    }
}
