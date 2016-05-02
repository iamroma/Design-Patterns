package com.roma.design.patterns.builder.classes;

import com.roma.design.patterns.builder.interfaces.Item;
import com.roma.design.patterns.builder.interfaces.Packing;

/**
 * Created by Roma on 5/3/16.
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
