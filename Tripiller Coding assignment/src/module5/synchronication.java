package module5;
class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter c;

    MyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 200; i++) {
            c.increment();
        }
    }
}

public class synchronication {
    public static void main(String[] args) {

        Counter c = new Counter();   // shared object

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Final Counter Value: " + c.count);
    }
}
