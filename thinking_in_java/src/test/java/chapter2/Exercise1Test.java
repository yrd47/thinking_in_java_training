package chapter2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yrd on 2017/6/9.
 */
public class Exercise1Test {

    private Exercise1 exercise1 = new Exercise1();

    @Test
    public void getDefaultInitialInt() {
        int expected = 0;
        assertEquals(expected, exercise1.getDefaultIntialInt());
    }

    @Test
    public void getDeaultIntialChar() {
        char expected = '\0';
        assertEquals(expected, exercise1.getDefaultIntialChar());
    }

    @Test
    public void test() {
        System.out.println(exercise1.toString());
    }
}
