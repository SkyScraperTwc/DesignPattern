package indi.twc.pattern.observer.impl;

import indi.twc.pattern.observer.Observer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
/**
 * 被观察者
 */
@Data
public class Subject {
    /**
     * 状态
     */
    private int state;

    private List<Observer> observerList = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //通知观察者，状态已经改变
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
