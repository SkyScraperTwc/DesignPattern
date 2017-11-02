package indi.twc.design.strategy;

/**
 * 策略模式具体类
 */
public class OperationSub implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
