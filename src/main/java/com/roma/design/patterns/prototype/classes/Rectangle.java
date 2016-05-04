package com.roma.design.patterns.prototype.classes;

/**
 * Created by Roma on 5/4/16.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
