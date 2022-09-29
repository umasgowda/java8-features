/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package designpattern.creational.singleton;

/**
 * @author piksel
 */

/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
 * The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time.
 * It will destroy the singleton pattern and both threads will get the different instances of the singleton class.
 */
public class LazyInitialisedSingleton {
    private static LazyInitialisedSingleton instance;

    private LazyInitialisedSingleton() {

    }

    public static LazyInitialisedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitialisedSingleton();
        }
        return instance;
    }
}
