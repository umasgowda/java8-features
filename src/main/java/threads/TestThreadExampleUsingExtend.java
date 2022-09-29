package threads;

/**
 * https://beginnersbook.com/2015/03/why-dont-we-call-run-method-directly-why-call-start-method/
 */
public class TestThreadExampleUsingExtend {

    public static void main(String[] args) {

        ExampleThreadUsingExtend exampleThreadUsingExtend = new ExampleThreadUsingExtend();
        Thread te = new Thread(exampleThreadUsingExtend);
        te.start();

        ExampleThreadUsingExtend exampleThreadUsingExtend1 = new ExampleThreadUsingExtend();
        Thread te1 = new Thread(exampleThreadUsingExtend1);
        te1.start();



    }



}
