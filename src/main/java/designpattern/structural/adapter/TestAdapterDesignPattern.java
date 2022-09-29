/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.structural.adapter;

/**
 * https://www.geeksforgeeks.org/adapter-pattern/
 */

public class TestAdapterDesignPattern {

    public static void main(String args[]) {

        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdAdapter(sparrow) ;

        System.out.println(" sparrow ....");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println(" toy duck...");
        toyDuck.squeak();

        //toyduck behaving like a bird
        System.out.printf("ToyDuck behaving like a bird...");
        birdAdapter.squeak();

    }

}
