package indi.twc.pattern.factory.impl;

import indi.twc.pattern.factory.AbstractFactory;
import indi.twc.pattern.factory.Shape;

/**
 * 具体工厂类ShapeFactory
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
