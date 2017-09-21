package chapter7;

import java.util.Random;

/**
 * Created by yrd on 2017/7/5.
 */

class Value {
    int i;
    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {

    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static  final int VALUE_THREE = 39;
    private final int i4 = random.nextInt(20);



}
