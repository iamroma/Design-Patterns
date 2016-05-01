package com.roma.design.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roma on 5/1/16.
 */
public class SingleObject {

    // Create an Object of SingleObject
    private static SingleObject instance = new SingleObject();
    private List list = new ArrayList();

    // Make the constructor private so that this class can't be instantiated
    private SingleObject() {
        System.out.println("SingleObject was newed..");
    }

    // Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    // Print somethings
    public void showMessage() {
        System.out.println("Hello Roma!");
    }
}
