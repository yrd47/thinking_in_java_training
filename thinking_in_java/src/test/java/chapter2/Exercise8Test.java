package chapter2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by yrd on 2017/6/16.
 */
public class Exercise8Test {

    @Test
    public void staticTest() throws Exception {
        Exercise8 exercise8 = new Exercise8();
        Exercise8 exercise81 = new Exercise8();

        assertEquals(exercise8.getI(), exercise81.getI());
        assertEquals(exercise8.getObject(), exercise81.getObject());
        exercise8.i++;
        exercise8.object = new Object();
        assertEquals(exercise8.getI(), exercise81.getI());
        assertEquals(exercise8.getObject(), exercise81.getObject());
    }
}
