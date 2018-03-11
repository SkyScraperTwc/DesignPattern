package indi.twc.pattern.factory.impl;

import indi.twc.pattern.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
