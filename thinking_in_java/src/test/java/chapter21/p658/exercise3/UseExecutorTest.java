package chapter21.p658.exercise3;

import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/9/21.
 */
public class UseExecutorTest {

    @Test
    public void useCachedThreadPoolTest() throws Exception {
        System.out.println("----------useCachedThreadPoolTest----------");
        UseExecutor useExecutor = new UseExecutor();
        useExecutor.useCachedThreadPool();
        Thread.sleep(100);
    }

    @Test
    public void useFixedThreadPoolTest() throws Exception {
        System.out.println("----------useFixedThreadPoolTest----------");
        UseExecutor useExecutor = new UseExecutor();
        useExecutor.useFixedThreadPool();
        Thread.sleep(100);
    }

    @Test
    public void useSingleThreadPoolTest() throws Exception {
        System.out.println("----------useSingleThreadPoolTest----------");
        UseExecutor useExecutor = new UseExecutor();
        useExecutor.useSingleThreadPool();
        Thread.sleep(100);
    }
}
