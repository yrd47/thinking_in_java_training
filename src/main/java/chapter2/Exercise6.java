package chapter2;

/**
 * Created by yrd on 2017/6/16.
 */
public class Exercise6 {

    String s = "Hello World!";

    int storage(String s) {
        return s.length() * 2;
    }

    void print() {
        System.out.println("storage(s) = " + storage(s));
    }

    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        exercise6.print();
    }

}
