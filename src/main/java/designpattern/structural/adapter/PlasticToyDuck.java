/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.structural.adapter;

/**
 * @author piksel
 */
public class PlasticToyDuck implements ToyDuck {

    @Override
    public void squeak() {
        System.out.println(" squeak squeak ");
    }
}
