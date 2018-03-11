package indi.twc.pattern.proxy.cglib;

public class CgLibProxy extends CgLib {

    @Override
    public void query() {
        System.out.println("query..before....");
        super.query();
        System.out.println("query..after....");
    }
}
