/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.creational.prototype;

/**
 * @author piksel
 */
public class PineTree extends Tree {
    private String type;

    public PineTree(double mass, double height) {
        super(mass, height);
        this.type = "Pine";
    }

    public String getType() {
        return type;
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }

}
