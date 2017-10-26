package chapter7.p129.exercise2;

/**
 * Created by yrd on 2017/10/26.
 */
public class Yrd extends Detergent {

    public void scrub() {
        append(" Yrd.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }
}
