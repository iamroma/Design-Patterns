package com.roma.design.patterns.creational.prototype.classes;

/**
 * Created by Roma on 5/4/16.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
