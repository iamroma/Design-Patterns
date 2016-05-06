package com.roma.design.patterns.structural.bridge.classes;

import com.roma.design.patterns.structural.bridge.interfaces.DrawAPI;

/**
 * Created by Roma on 5/6/16.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
