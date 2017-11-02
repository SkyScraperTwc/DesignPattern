package indi.twc.design.observer;

public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
