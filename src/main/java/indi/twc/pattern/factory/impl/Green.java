package indi.twc.pattern.factory.impl;

import indi.twc.pattern.factory.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
