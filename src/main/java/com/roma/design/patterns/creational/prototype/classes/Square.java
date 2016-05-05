package com.roma.design.patterns.creational.prototype.classes;

/**
 * Created by Roma on 5/4/16.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
