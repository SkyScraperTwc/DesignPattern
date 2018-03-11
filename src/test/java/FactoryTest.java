package indi.twc.pattern.factory.test;

import indi.twc.pattern.factory.*;
import indi.twc.pattern.factory.impl.ColorFactory;
import indi.twc.pattern.factory.impl.FactoryCreator;
import indi.twc.pattern.factory.impl.ShapeFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void testFactory() {
        ShapeFactory shapeFactory = (ShapeFactory) FactoryCreator.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        ColorFactory colorFactory = (ColorFactory) FactoryCreator.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        color1.fill();
        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();
    }
}
