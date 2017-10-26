package chapter7.p132.exercise11;

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

    private Cleanser cleanser = new Cleanser();

    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
    }

    public void foam() {
        cleanser.append(" Detergent.foam()");
    }

    public String toString() {
        return cleanser.toString();
    }
}
