package chapter3;

import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/6/16.
 */
public class Exercise3Test {

    static void f (Exercise3 exercise3) {
        exercise3.f = 1.2f;
    }

    @Test
    public void test() {
        Exercise3 exercise = new Exercise3();
        exercise.f = 1.0f;
        System.out.println("Exercise.f : " + exercise.f);
        f(exercise);
        System.out.println("Exercise.f : " + exercise.f);
    }
}
