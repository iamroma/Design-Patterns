package com.roma.design.patterns.structural.bridge.classes;

import com.roma.design.patterns.structural.bridge.interfaces.DrawAPI;

/**
 * Created by Roma on 5/6/16.
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
