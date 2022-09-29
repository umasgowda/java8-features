/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.structural.adapter;

/**
 *  https://www.geeksforgeeks.org/adapter-pattern/
 */
public class BirdAdapter implements ToyDuck {

    // You need to implement the interface your client expects to use.
    Bird bird;

    public BirdAdapter(Bird bird) {
        // we need reference to the object we are adapting
        this.bird = bird;
    }


    public void squeak() {
        bird.fly();
        bird.makeSound();
    }
}
