package chapter12;

/**
 * Created by yrd on 2017/11/6.
 */
class SimpleException extends Exception {}

public class InheritingExceptions {

    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try {
            inheritingExceptions.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
        }
    }
}
