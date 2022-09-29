package threads;


/**
 * @author piksel
 */
public class ExampleThreadUsingExtend extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 3 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}