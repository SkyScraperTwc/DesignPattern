package indi.twc.pattern.observer;

import indi.twc.pattern.observer.impl.Subject;

/**
 * 观察者
 */
public abstract class Observer {

    public Subject subject;

    public abstract void update();
}
