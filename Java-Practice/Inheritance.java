// we can inherit multiple number of class

/*class BasicCal {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int subs(int n1, int n2) {
        return n1 - n2;
    }
}

class PowerClass {
    public double pow(int n1, int n2) {
        return Math.pow(n1, n2);
    }
} 
// class AdvCal extends BasicCal,PowerClass......it won't work in java...as
// multiple inheritence doesn't work in java.

class AdvCal extends BasicCal {
    public int mult(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
} */
class A {
    public A() {
        System.out.println("I am normal A");
    }

    public A(int n) {
        System.out.println("I am parameterized A");
    }
}

class B extends A {
    public B() {
        super(2); // every constructor has super function that is hidden.
        System.out.println("I am normal B");
    }

    public B(int n) {
        this();
        System.out.println("I am parameterized B");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        /*
         * AdvCal adv = new AdvCal();
         * System.out.println(adv.sum(10, 20));
         * System.out.println(adv.div(10, 2));
         */
        new B();
        new B(10);

    }
}
