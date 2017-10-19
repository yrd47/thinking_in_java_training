package chapter21.p654;

import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/9/21.
 */
public class LiftOffTest3 {

    @Test
    public void liftOffTest() throws Exception {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
        Thread.sleep(10);
    }
}
