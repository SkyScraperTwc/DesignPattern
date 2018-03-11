package indi.twc.pattern.factory;

/**
 * 抽象工厂类
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 * 该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 */
public abstract class AbstractFactory {
    public Shape getShape(String shapeType) {
        return null;
    }
    public Color getColor(String colorType) {
        return null;
    }
}
