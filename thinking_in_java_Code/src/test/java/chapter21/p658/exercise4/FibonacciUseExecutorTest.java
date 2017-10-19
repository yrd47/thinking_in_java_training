package chapter21.p658.exercise4;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by yrd on 2017/9/21.
 */
public class FibonacciUseExecutorTest {

    @Test
    public void useCachedThreadPool() throws Exception {
        FibonacciUseExecutor fe = new FibonacciUseExecutor();
        fe.useCachedThreadPool();
        TimeUnit.MILLISECONDS.sleep(1000);
    }

    @Test
    public void useFixedThreadPool() throws Exception {
        FibonacciUseExecutor fe = new FibonacciUseExecutor();
        fe.useFixedThreadPool();
        Thread.sleep(1000);
    }

    @Test
    public void useSingleThreadPool() throws Exception {
        FibonacciUseExecutor fe = new FibonacciUseExecutor();
        fe.useSingleThreadPool();
        Thread.sleep(1000);
    }

}
