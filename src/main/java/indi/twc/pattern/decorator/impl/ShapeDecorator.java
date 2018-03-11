package indi.twc.pattern.decorator.impl;

/**
 * 抽象装饰类
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape ShapeDecorator){
        this.decoratedShape = ShapeDecorator;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
