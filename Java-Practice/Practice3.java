// polymorphism can be of 2 types..compile time & run time..
/*
 * 1. overloading is compile time
 * 2. overriding is run time
 */

// run time polymorphism this is... dyanamic method dispatch it is... object is referring a new class each time.
class X {
    public void show() {
        System.out.println("I show X");
    }
}

class Y extends X {
    @Override
    public void show() {
        System.out.println("I show Y");
    }
}

class Z extends X {
    public void show() {
        System.out.println("I show Z");
    }
}

public class Practice3 {
    public static void main(String a[]) {
        X x = new X();
        x.show();
        x = new Y();
        x.show();
        x = new Z();
        x.show();

    }
}
// final variable can not be reassigned, method can not be overridden & class
// can't be extended.