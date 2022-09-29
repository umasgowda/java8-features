package threads;

class A extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MainThread {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        b.start();

    }
}
