/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.creational.builder;

/**
 * @author piksel
 */
public class TestComputer {

    public static void main(String args[]) {
        Computer computer = new Computer.ComputerBuilder("name").setBrand("apple").setPrice(34l).build();
    }
}
