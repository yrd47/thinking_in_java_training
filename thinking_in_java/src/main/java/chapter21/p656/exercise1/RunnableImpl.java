package chapter21.p656.exercise1;

/**
 * Created by yrd on 2017/9/21.
 */
public class RunnableImpl implements Runnable {

    public static int taskCount = 0;
    public final int id = taskCount++;

    public RunnableImpl() {
        System.out.println("Thread " + id + " starts.");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + id + " runs " + (i + 1) + " times.");
            Thread.yield();
        }
        System.out.println("Thread " + id + " ends.");
    }

}
