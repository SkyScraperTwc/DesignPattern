package indi.twc.pattern.factory.impl;

import indi.twc.pattern.factory.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
