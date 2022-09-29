package threads;

/**
 * https://beginnersbook.com/2015/03/why-dont-we-call-run-method-directly-why-call-start-method/
 */
public class TestThreadExampleUsingRunnable {
    public static void main(String[] args) {
        ExampleThreadUsingRunnable exampleThreadUsingRunnable = new ExampleThreadUsingRunnable();
        Thread tr = new Thread(exampleThreadUsingRunnable);
        tr.start();

        ExampleThreadUsingRunnable exampleThreadUsingRunnable1 = new ExampleThreadUsingRunnable();
        Thread tr1 = new Thread(exampleThreadUsingRunnable1);
        tr1.start();
    }
}
