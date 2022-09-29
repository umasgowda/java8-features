package designpattern.structural.decorator;

/**
 * @author piksel
 */
public class LuxuaryCar extends CarDecorator {
    public LuxuaryCar(Car car) {
        super(car);
    }


    public void assemble(){
        super.assemble();
        System.out.println("Adding features of luxuary car");
    }
}
