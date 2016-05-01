package com.roma.design.patterns.abstract_factory;

/**
 * Created by Roma on 5/1/16.
 */
public class FactoryProducer {

    public static AbstractFactory produce(String choice) {

        if ("SHAPE".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }

        if ("COLOR".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }

        return null;
    }
}
