package com.roma.design.patterns.creational.abstractFactory.classes;

import com.roma.design.patterns.creational.abstractFactory.interfaces.Color;

/**
 * Created by Roma on 5/1/16.
 */
public class Red implements Color {

    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
