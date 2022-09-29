package bjss;

/**
 * @author piksel
 */
public class StaticExample {
    private static int b = 1; //static variable
    private int a = 1;  //class variable

    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            StaticExample app = new StaticExample();// here for all iteration - new object will be created.
            app.aMethod();
        }

    }

    private void aMethod() {
        System.out.println("a " + a + " b " + b);
        a++;
        b++;

    }
}
