package com.roma.design.patterns.abstractFactory.classes;

import com.roma.design.patterns.abstractFactory.interfaces.Shape;

/**
 * Created by Roma on 5/1/16.
 */
public class Circle implements Shape {

    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
