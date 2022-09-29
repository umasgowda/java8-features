/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.creational.prototype;

/**
 * @author piksel
 */
public class TestProtypeDesignPattern {


    public static void main(String args[]) {
        PlasticTree plasticTree = new PlasticTree(10, 20);
        plasticTree.setPosition(30);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(40);

        boolean check1stObject = 30 == plasticTree.getPosition();
        System.out.println(" plasticTree " + check1stObject);

        boolean checkAnotherObject = 40 == anotherPlasticTree.getPosition();
        System.out.println(" another plastic tree " + checkAnotherObject);

    }
}
