package chapter2;

/**
 * Created by yrd on 2017/6/9.
 */
public class Exercise3 {
    private final String name;

    public Exercise3(String name) {
        this.name = name;
    }

    public String sayYourName() {
        return "Hello + " + name;
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3("yrd");
        System.out.println(exercise3.sayYourName());
    }

}
