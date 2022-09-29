/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.creational.builder;

/**
 * Let’s see how we can implement builder design pattern in java.
 *
 * First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
 * Java Builder class should have a public constructor with all the required attributes as parameters.
 * Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
 * The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.
 */
public class Computer {
    private String name;
    private String brand;
    private long price;

    private Computer(ComputerBuilder builder) {
        this.name = builder.name;
        this.brand = builder.brand;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public long getPrice() {
        return price;
    }

    public static class ComputerBuilder {
        private String name;
        private String brand;
        private long price;

        public ComputerBuilder(String name) {
            this.name= name;
        }
        public Computer build() {
            return new Computer(this);
        }

        public ComputerBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ComputerBuilder setPrice(long price) {
            this.price = price;
            return this;
        }

    }
}
