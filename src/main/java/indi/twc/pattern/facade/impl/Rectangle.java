package indi.twc.pattern.facade.impl;

import indi.twc.pattern.facade.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
