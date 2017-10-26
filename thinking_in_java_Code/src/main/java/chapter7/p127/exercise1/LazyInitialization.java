package chapter7.p127.exercise1;

/**
 * Created by yrd on 2017/10/26.
 */
public class LazyInitialization {

    private Simple simple;

    public String toString() {
        simple = new Simple();
        simple.setS("TestLazyInitialization");
        return simple.toString();
    }
}
