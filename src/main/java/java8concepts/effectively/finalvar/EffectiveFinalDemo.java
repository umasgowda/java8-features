package java8concepts.effectively.finalvar;

/**
 * Can we use non-final local variables inside an Anonymous class?
 * No, it's not allowed until Java 7.
 * From Java 8 onward you can use a non-final local variable inside an anonymous or local inner class, provided it's effectively final,
 * which means it's not changed after initialized.
 *
 * There is hardly any difference between a final local variable and an effectively final variable, once declared you cannot change values of both of them.
 * If you do, the compiler will raise error.
 *
 * You can see that we can access "effectiveFinal" variable without any issue in the lambda expression
 */
public class EffectiveFinalDemo {

    public static void main(String[] args) {
        String nonFinalVar = " I am non final string variable";

        //inner class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Using non-final string variable inside annymous class");
                System.out.println("value of nonfinal variable " + nonFinalVar);

                //Compile time error - "local variables referenced from a inner class must be final or effectively final"
                //nonFinalVar = "15";
            }
        };

        //lambda expression
        Runnable runnable = () -> {
            System.out.println(" trying to access non final variable " + nonFinalVar);
        };

        Thread t = new Thread(r);
        t.start();
    }
}
