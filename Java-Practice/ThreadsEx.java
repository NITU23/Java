// we can create the thread using thread class..

class A extends Thread {
    public void run() { // every thread has run method
        for (int i = 0; i < 20; i++) {
            System.out.println("In A class");
            try {
                Thread.sleep(10); // this is only thread waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

// we can create the thread implementing the Runnable class as well...because at
// the end thread class also implements runnable interface
// Runnable interface doesn't have the thread method..
class B implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("In B class");
            try {
                Thread.sleep(10); // this is only thread waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadsEx {
    public static void main(String[] args) {
        A obj1 = new A();
        Runnable obj2 = new B(); // we can create reference of interface & object of class.

        /*
         * System.out.println(obj1.getPriority());
         * obj1.setPriority(Thread.MAX_PRIORITY); // by default it is 10
         */
        obj1.start(); // start method is default method for thread
        Thread t = new Thread(obj2);
        t.start();
    }
}
