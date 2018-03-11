package indi.twc.pattern.strategy.impl;

import indi.twc.pattern.strategy.Strategy;

/**
 * 策略模式具体类
 */
public class OperationAdd  implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
