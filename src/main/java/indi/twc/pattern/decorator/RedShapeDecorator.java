package indi.twc.pattern.decorator;

import indi.twc.pattern.decorator.impl.Shape;
import indi.twc.pattern.decorator.impl.ShapeDecorator;

/**
 * 实体装饰类
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape ShapeDecorator) {
        super(ShapeDecorator);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
