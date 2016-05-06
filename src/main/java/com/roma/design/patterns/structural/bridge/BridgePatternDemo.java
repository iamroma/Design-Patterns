package com.roma.design.patterns.structural.bridge;

import com.roma.design.patterns.structural.bridge.classes.Circle;
import com.roma.design.patterns.structural.bridge.classes.GreenCircle;
import com.roma.design.patterns.structural.bridge.classes.RedCircle;
import com.roma.design.patterns.structural.bridge.classes.Shape;

/**
 * Created by Roma on 5/6/16.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
