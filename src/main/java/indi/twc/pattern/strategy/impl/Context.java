package indi.twc.pattern.strategy.impl;

import indi.twc.pattern.strategy.Strategy;

/**
 * 策略模式具体类
 */
public class Context {

    public Strategy strategy;

    public int executeOperation(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

    //使用哪个策略
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
