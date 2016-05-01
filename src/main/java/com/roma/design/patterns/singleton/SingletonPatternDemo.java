package com.roma.design.patterns.singleton;

/**
 * Created by Roma on 5/1/16.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        // It show the SingleObject() method has private access error
        // SingleObject singleObject = new SingleObject();

        // Get the only object available
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
