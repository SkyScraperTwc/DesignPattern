package indi.twc.pattern.observer.impl;

import indi.twc.pattern.observer.Observer;

/**
 *
 */
public class BinaryObserver  extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.getObserverList().add(this);
    }
    @Override
    public void update() {
        System.out.println("subject state:" + subject.getState());
    }
}
