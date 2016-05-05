package com.roma.design.patterns.creational.abstractFactory.classes;

import com.roma.design.patterns.creational.abstractFactory.interfaces.Color;
import com.roma.design.patterns.creational.abstractFactory.interfaces.Shape;

/**
 * Created by Roma on 5/1/16.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
