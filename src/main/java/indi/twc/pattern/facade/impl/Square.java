package indi.twc.pattern.facade.impl;

import indi.twc.pattern.facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
