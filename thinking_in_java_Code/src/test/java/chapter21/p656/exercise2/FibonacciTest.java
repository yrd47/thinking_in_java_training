package chapter21.p656.exercise2;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

/**
 * Created by yrd on 2017/9/21.
 */
public class FibonacciTest {

    @Test
    public void fibonacciTest() throws Exception {
        IntStream.range(0,10).forEach(i -> {
            new Thread(new Fibonacci(i)).start();
        });
        Thread.sleep(100);
    }
}
