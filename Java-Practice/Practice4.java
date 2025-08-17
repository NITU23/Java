/*
class A {
    String s;
    int a;

    @Override
    public int hashCode() { // these are example of use of methods of Object class in Java.
        final int prime = 31;
        int result = 1;
        result = prime * result + ((s == null) ? 0 : s.hashCode());
        result = prime * result + a;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (s == null) {
            if (other.s != null)
                return false;
        } else if (!s.equals(other.s))
            return false;
        if (a != other.a)
            return false;
        return true;
    }

}
 */

class A {
    public void show() {
        System.out.println("Show Method");
    }
}

class B extends A {
    public void show1() {
        System.out.println("Show Method2");
    }
}

public class Practice4 {

    public static void main(String[] args) {
        // A a = new A();
        // System.out.println(a.toString()); // every object has to String method by
        // default...it can be overridden in
        // // class method.
        A a = (A) new B(); // upcasting child->parent (Assigning a child class object to a parent class
                           // reference.)
        a.show();

        B obj2 = (B) a; // downcasting parent->child (Assigning a parent class reference back to a child
                        // class reference.)
        obj2.show1();

    }
}
