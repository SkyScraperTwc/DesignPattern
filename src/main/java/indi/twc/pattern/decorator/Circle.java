package indi.twc.pattern.decorator;

import indi.twc.pattern.decorator.impl.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
