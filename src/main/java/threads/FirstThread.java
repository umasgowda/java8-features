package threads;

/**
 * @author piksel
 */
public class FirstThread implements Runnable {
    int values[] = {1, 2, 3, 4, 5};

    @Override
    public void run() {
        for (int i = 0; i < values.length; i++) {
            System.out.println(" values " + values[i] * 2);
        }
    }
}
