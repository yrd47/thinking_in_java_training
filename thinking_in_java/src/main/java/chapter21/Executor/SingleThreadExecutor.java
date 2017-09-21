package chapter21.Exexutor;

import chapter21.p654.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yrd on 2017/9/21.
 */
public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
