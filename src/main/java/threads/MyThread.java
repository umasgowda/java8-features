package threads;




public class MyThread extends Thread {

    int values[] = {1, 2, 3, 4, 5};

    public void run() {

        for (int i = 0; i < values.length; i++) {
            System.out.println(" values " + values[i] * 2);
        }
    }
}
