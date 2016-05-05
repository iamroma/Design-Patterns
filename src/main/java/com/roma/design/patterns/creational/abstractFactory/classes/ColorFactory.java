package com.roma.design.patterns.creational.abstractFactory.classes;

import com.roma.design.patterns.creational.abstractFactory.interfaces.Color;
import com.roma.design.patterns.creational.abstractFactory.interfaces.Shape;

/**
 * Created by Roma on 5/1/16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {

        if (color == null || "".equals(color.trim())) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }

        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }

        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
