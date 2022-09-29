package designpattern.structural.decorator;

/**
 * https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 *
 * 1. Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior.
 * 2.  It uses abstract classes or interface with composition to implement.
 */
public class TestDecoratorPattern {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("****************/n");

        Car luxuaryCar = new LuxuaryCar(new SportsCar(new BasicCar()));
        luxuaryCar.assemble();

    }
}
