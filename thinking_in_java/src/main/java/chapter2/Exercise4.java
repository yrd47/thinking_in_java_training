package chapter2;

import lombok.Data;

/**
 * Created by yrd on 2017/6/9.
 */
public class Exercise4 {

    @Data
    private static class DataOnly {

        private int i;
        private double d;
        private boolean b;

        public DataOnly (int i, double d, boolean b) {
            this.i = i;
            this.d = d;
            this.b = b;
        }

        @Override
        public String toString() {
            return "DataOnly { " +
                    "i = " + i +
                    ", d = " + d +
                    ", b = " + b +
                    "}";
        }


        public void setB(boolean b) {
            this.b = b;
        }
    }

    public static void main(String[] args){
        DataOnly dataOnly = new DataOnly(1, 1.5d, false);
        System.out.println(dataOnly);
        dataOnly.setB(true);
        System.out.println(dataOnly);

    }

}
