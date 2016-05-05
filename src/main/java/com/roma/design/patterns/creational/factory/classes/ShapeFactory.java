package com.roma.design.patterns.creational.factory.classes;

import com.roma.design.patterns.creational.factory.interfaces.Shape;

/**
 * Created by Roma on 5/1/16.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {

        // use getShape method to get object of type shape
        if (shapeType == null || "".equals(shapeType.trim())) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;

    }
}
