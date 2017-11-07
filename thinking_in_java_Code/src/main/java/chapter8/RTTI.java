package chapter8;

/**
 * Created by yrd on 2017/10/31.
 */

class Useful {
    public void f() {
        System.out.println("Useful.f()");
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {
        System.out.println("MoreUseful.f()");
    }
    public void g() {
        System.out.println("MoreUseful.g()");
    }
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] s = {new Useful(), new MoreUseful()};
        s[0].f();
        s[1].f();
    }
}
