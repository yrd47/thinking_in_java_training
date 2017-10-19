package chapter21.p658.exercise4;

import chapter21.p656.exercise2.Fibonacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by yrd on 2017/9/21.
 */
public class FibonacciUseExecutor {

    public void useCachedThreadPool() throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        IntStream.range(5, 15).forEach(i -> {
            exec.execute(new Fibonacci(i));
        });
        exec.shutdown();
    }

    public void useFixedThreadPool() throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        IntStream.range(5, 15).forEach(i -> {
            exec.execute(new Fibonacci(i));
        });
        exec.shutdown();
    }

    public void useSingleThreadPool() throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        IntStream.range(5, 15).forEach(i -> {
            exec.execute(new Fibonacci(i));
        });
        exec.shutdown();
    }
}
