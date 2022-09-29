package java8concepts.effectively.finalvar;



/**
 * @author piksel
 */
public class Cclass  extends A {

    @Override
    public void show() {

        System.out.println("Child class");

    }

    public static void main(String[] args) {

        A a = new Cclass(); //reference variable of parent class 'a' points to object of subclass 'Cclass'

        Cclass c = (Cclass) a;
        c.show();


    }
}
