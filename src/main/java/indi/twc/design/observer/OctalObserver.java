package indi.twc.design.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.getObservers().add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + subject.getState());
    }
}
