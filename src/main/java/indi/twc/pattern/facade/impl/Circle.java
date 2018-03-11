package indi.twc.pattern.facade.impl;

import indi.twc.pattern.facade.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
