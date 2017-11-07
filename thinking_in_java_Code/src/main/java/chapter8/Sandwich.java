package chapter8;

/**
 * Created by yrd on 2017/10/30.
 */
class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lecture {
    Lecture() {
        System.out.println("Lecture()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch {

    private static Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lecture lecture = new Lecture();
    public Sandwich() {
        System.out.println("Sandwich");
    }
    public static void main(String[] args) {
        new Sandwich();
    }
}
