interface A { // we can't create object of interface.. but we can use the reference.
    int age = 44;// by default all the variable in interface are final & static.

    void show(); // be default all the methods of interface is public & abstract

    void config();
}

class B implements A {
    public void show() {
        System.out.println("show implemented");
    }

    public void config() {
        System.out.println("config implemented");
    }
}

enum Status { // java also have enum
    Running, Failed
}

enum Laptop {
    Macbook(2000), windows(1000), xp(1000);

    private int price;

    private Laptop(int price) { // constructor
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Interface {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        System.out.println(A.age); // we can use directly the variable without creating the object
        Status s = Status.Running;
        System.out.println(s);

        Status[] ss = Status.values();
        System.out.println(ss[1] + " order " + ss[1].ordinal());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}

// a function interface can have only one function in that interface... with the
// annotations.. @FunctionInterface