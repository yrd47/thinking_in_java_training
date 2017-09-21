package chapter2;

import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/6/16.
 */
public class Exercise9Test {

    @Test
    public void exercise9() {
        Exercise9 exercise9 =new Exercise9();
        exercise9.testBoolean(true);
        exercise9.testByte((byte) 10000);
        exercise9.testChar('c');
        exercise9.testShort((short) 1);
        exercise9.testInt(123);
        exercise9.testLong(1000000L);
        exercise9.testFloat((float) 1.1);
        exercise9.testDouble(1.234);
    }

}
