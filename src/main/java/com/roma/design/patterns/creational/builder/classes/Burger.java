package com.roma.design.patterns.creational.builder.classes;

import com.roma.design.patterns.creational.builder.interfaces.Item;
import com.roma.design.patterns.creational.builder.interfaces.Packing;

/**
 * Created by Roma on 5/3/16.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
