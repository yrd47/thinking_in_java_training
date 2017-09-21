package chapter3;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Created by yrd on 2017/6/20.
 */
public class Exercise4Test {

    @Test
    public void test() {
        Exercise4 exercise4 = new Exercise4();
        assertEquals(exercise4.speed(8,4), 2);
    }
}
