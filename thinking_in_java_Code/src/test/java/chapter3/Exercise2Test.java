package chapter3;

import org.testng.annotations.Test;

/**
 * Created by yrd on 2017/6/16.
 * java别名现象
 */
public class Exercise2Test {

    @Test
    public void test() {
        Exercise2 exercise = new Exercise2();
        Exercise2 exercise2 = new Exercise2();
        exercise.f = 1.00f;
        exercise2.f = 1.11f;
        System.out.println("exercise : " + exercise.f + " exercise2 : " + exercise2.f);
        exercise = exercise2;
        System.out.println("exercise : " + exercise.f + " exercise2 : " + exercise2.f);
        exercise.f = 2.22f;
        System.out.println("exercise : " + exercise.f + " exercise2 : " + exercise2.f);
    }
}
