package com.roma.design.patterns.builder.classes;

import com.roma.design.patterns.builder.interfaces.Packing;

/**
 * Created by Roma on 5/3/16.
 */
public class Bottle implements Packing {

    public String pack() {
        return "Bottle";
    }
}
