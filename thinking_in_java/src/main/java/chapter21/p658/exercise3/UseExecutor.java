package chapter21.p658.exercise3;

import chapter21.p656.exercise1.RunnableImpl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by yrd on 2017/9/21.
 */
public class UseExecutor {

    public void useCachedThreadPool() throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0,10).forEach(i -> {
            executorService.execute(new RunnableImpl());
        });
        executorService.shutdown();
    }

    public void useFixedThreadPool() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        IntStream.range(0,5).forEach(i -> {
            executorService.execute(new RunnableImpl());
        });
        executorService.shutdown();
    }

    public void useSingleThreadPool() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        IntStream.range(0,3).forEach(i -> {
            executorService.execute(new RunnableImpl());
        });
        executorService.shutdown();
    }
}
