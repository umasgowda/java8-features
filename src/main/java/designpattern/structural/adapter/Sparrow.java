/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.structural.adapter;

/**
 * @author piksel
 */
public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println(" Flying ");;

    }

    @Override
    public void makeSound() {
        System.out.println(" Chirp Chirp ");

    }
}
