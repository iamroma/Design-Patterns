package com.roma.design.patterns.builder.classes;

/**
 * Created by Roma on 5/3/16.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
