package com.roma.design.patterns.factory;

/**
 * Created by Roma on 5/1/16.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        //get an object by shape type.
        Shape circle = factory.getShape("circle");
        Shape square = factory.getShape("square");
        Shape rectangle = factory.getShape("rectangle");

        // call their draw methods.
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
