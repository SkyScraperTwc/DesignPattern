package indi.twc.pattern.factory.impl;

import indi.twc.pattern.factory.AbstractFactory;

/**
 * 工厂创造器
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
