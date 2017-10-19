package chapter1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by yrd on 2017/9/22.
 */
public class Exerxise1Test {

    @Test
    public void JavaTest() throws Exception {
        Exercise1 exercise1 = new Exercise1();
        assertEquals(exercise1.Java(), "Java");
    }
}
