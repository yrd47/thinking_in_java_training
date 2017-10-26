package chapter7.p129.exercise2;

/**
 * Created by yrd on 2017/10/26.
 */

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }
    public String toString() {
        return s;
    }
}

public class Detergent extends Cleanser{
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam() {
        append(" foam()");
    }
}
