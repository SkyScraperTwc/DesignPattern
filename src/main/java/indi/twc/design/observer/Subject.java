package indi.twc.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;
    private List<Observer> observers = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
