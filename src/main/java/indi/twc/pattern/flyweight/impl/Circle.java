package indi.twc.pattern.flyweight.impl;

import indi.twc.pattern.flyweight.Shape;
import lombok.Data;

@Data
public class Circle implements Shape {

    private String color;

    private int x;

    private int y;

    private int radius;

    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }

}
