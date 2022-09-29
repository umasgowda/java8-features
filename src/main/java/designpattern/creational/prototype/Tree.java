/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.creational.prototype;

/**
 * @author piksel
 */
public abstract class Tree {
        private double mass;
        private double height;
        private double position;

        public Tree(double mass, double height) {
            this.mass = mass;
            this.height = height;
        }

        public void setMass(double mass) {
            this.mass = mass;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setPosition(double position) {
            this.position = position;
        }

        public double getMass() {
            return mass;
        }

        public double getHeight() {
            return height;
        }

        public double getPosition() {
            return position;
        }

        @Override
        public String toString() {
            return "Tree [mass=" + mass + ", height=" + height + ", position=" + position + "]";
        }

        public abstract Tree copy();
}