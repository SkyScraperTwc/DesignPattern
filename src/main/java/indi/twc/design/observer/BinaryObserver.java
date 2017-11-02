package indi.twc.design.observer;

public class BinaryObserver  extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.getObservers().add(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String: " + subject.getState());
    }
}
