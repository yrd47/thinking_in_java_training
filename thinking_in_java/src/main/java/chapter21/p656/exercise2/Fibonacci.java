package chapter21.p656.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by yrd on 2017/9/21.
 */
public class Fibonacci implements Runnable {

    public static int taskCount = 0;
    public final int id = taskCount++;
    private final int count;

    public Fibonacci(int count) {
        this.count = count;
    }

    public void run() {
        List<Long> sequence = new ArrayList<Long>();
        IntStream.range(0,count).forEach(i -> {
            if (i == 0 || i ==1) {
                sequence.add(1L);
            } else {
                sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
            }
        });
        System.out.println(sequence.stream().map(Object::toString).collect(Collectors.joining(",")));
    }
}
