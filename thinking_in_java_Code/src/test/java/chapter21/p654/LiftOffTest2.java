package chapter21.p654;

import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/9/21.
 */
public class LiftOffTest2 {

    /**
     * Thread构造器只需要一个Runnable对象。调用Thread对象的start()方法为该线程执行必须的初始化操作，然后调用Runnable的run()方法
     */
    @Test
    public void liftOffTest2() throws Exception {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff");
        Thread.sleep(10);
    }
}
