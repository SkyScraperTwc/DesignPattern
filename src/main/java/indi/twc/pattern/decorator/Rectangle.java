package indi.twc.pattern.decorator;

import indi.twc.pattern.decorator.impl.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
