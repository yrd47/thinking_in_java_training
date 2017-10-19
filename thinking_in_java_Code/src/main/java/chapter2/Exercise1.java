package chapter2;

/**
 * Created by yrd on 2017/6/9.
 */
public class Exercise1 {

    private int defaultIntialInt;
    private char defaultIntialChar;

    public int getDefaultIntialInt() {
        return defaultIntialInt;
    }

    public char getDefaultIntialChar() {
        return defaultIntialChar;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("DefaultIntial { ");
        stringBuilder.append("defaultIntialInt = ").append(defaultIntialInt);
        stringBuilder.append(", defaultIntialChar = ").append(defaultIntialChar);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
