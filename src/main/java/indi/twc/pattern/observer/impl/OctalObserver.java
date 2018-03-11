package indi.twc.pattern.observer.impl;

import indi.twc.pattern.observer.Observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.getObserverList().add(this);
    }

    @Override
    public void update() {
        System.out.println("subject state:" + subject.getState());
    }
}
