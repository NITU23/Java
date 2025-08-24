// a function interface can have only one function in that interface... with the
// annotations.. @FunctionInterface
@FunctionalInterface
interface A {

    void show(int i);
}

public class LambdaExpression {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(int i) {
                System.out.println("In Show method " + i);
            }
        };
        // this above expression is normal expression...& below is the lambda
        // expression..
        A obj1 = (i) -> {
            System.out.println("In lambda Show method " + i);
        };
        // or else
        A obj2 = i -> System.out.println("In lambda Show method " + i); // we can remove the curly bracket for one line
                                                                        // of statment.
        obj.show(1);

        obj1.show(2);

        obj2.show(10);

        /*
         * A obj3 = i -> i; // if its return type is int it will work..as they have
         * default return type
         * 
         * obj3.show(5);
         */

    }
}
