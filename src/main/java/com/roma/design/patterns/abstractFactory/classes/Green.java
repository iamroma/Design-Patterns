package com.roma.design.patterns.abstractFactory.classes;

import com.roma.design.patterns.abstractFactory.interfaces.Color;

/**
 * Created by Roma on 5/1/16.
 */
public class Green implements Color {

    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
