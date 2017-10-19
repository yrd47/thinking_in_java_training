package chapter21.p656.exercise1;

import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/9/21.
 */
public class RunnableImplTest {

    @Test
    public void runnableImplTest() throws Exception {
        for (int i = 0;i < 10; i++) {
            new Thread(new RunnableImpl()).start();
        }
        System.out.println("Waiting for threads");
        Thread.sleep(100);
    }
}
