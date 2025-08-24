class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class A {
    public void show() throws ClassNotFoundException {

        Class.forName("As");

    }
}

public class ExceptionHandle {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;

        try {
            if (j == 10) {
                throw new CustomException("Custom Exception Using");
            }
            if (i == 0) {
                throw new ArithmeticException("Please Don't use Zero");
            }

            System.out.println(j / i);
        } catch (CustomException e) {
            System.out.println("I am custom Exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e);
        } catch (Exception e) {
            System.out.println("Some thing is wrong " + e);
        }
        try {
            A obj = new A();
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class Nhi Mili : " + e);
        }

        System.out.println("After catch block");
    }
}
