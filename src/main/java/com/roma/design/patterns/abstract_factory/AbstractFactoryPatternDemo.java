package com.roma.design.patterns.abstract_factory;

/**
 * Created by Roma on 5/1/16.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.produce("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.produce("color");
        Color red = colorFactory.getColor("red");
        red.fill();
    }
}
