/*abstract class car { // abstract class
    public abstract void drive();

    public void playMusic() {
        System.out.println("play music");
    }
}

class BMW extends car { // concrete class
    public void drive() {
        System.out.println("Hey I am driving BMW");
    }
} */
// inner class can be static ...outer class can't be static

class A {

    void show() {
        System.out.println("In show method");
    }

    class B {
        void config() {
            System.out.println("In config method");
        }
    }

    static class C {
        void pay() {
            System.out.println("In pay method");
        }
    }
}

public class Abstract {
    public static void main(String[] args) {
        // BWM bmw = new car(); // it is give me the error as we can not create the
        // object of abstract class.
        // car c = new BMW();// this is fine as we can create the reference of abstract
        // class.
        // c.drive();
        A a = new A();
        a.show();

        A.B b = a.new B(); // for creating the obj of normal inner class we need object of A.
        b.config();

        A.C c = new A.C(); // for creating the obj of static inner class we need not object of A.
        c.pay();

        A aa = new A() { // Anonymous inner class...this same can be implementated for Abstract class as
                         // well.
            void show() {
                System.out.println(" Anonymous Inner class implementation");
            }
        };
        aa.show();
    }
}
