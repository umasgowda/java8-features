/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.creational.singleton;

/**
 * @author piksel
 */

/**
 * Eager Initialisation creates an instance when the class loaded. But it has a drawback - instance is created even though
 * client application might not be using it.
 */

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
