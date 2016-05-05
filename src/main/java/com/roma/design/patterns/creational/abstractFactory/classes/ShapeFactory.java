package com.roma.design.patterns.creational.abstractFactory.classes;

import com.roma.design.patterns.creational.abstractFactory.interfaces.Color;
import com.roma.design.patterns.creational.abstractFactory.interfaces.Shape;

/**
 * Created by Roma on 5/1/16.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {

        if (shape == null || "".equals(shape.trim())) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
