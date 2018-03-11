package indi.twc.pattern.flyweight.impl;

import indi.twc.pattern.flyweight.Shape;

import java.util.HashMap;

public class ShapeFactory {
    //关键代码：用 HashMap 存储这些对象。
    private static final HashMap<String, Shape> circleMap = new HashMap<String,Shape>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);
        //如果为空则创建对象
        if (circle==null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
