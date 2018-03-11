package indi.twc.pattern.template.impl;

import indi.twc.pattern.template.AbstractTemplate;

public class ConcreteTemplate extends AbstractTemplate {

    @Override
    public void abstractMethod() {
        System.out.println("ConcreteTemplate...abstractMethod()");
    }

}
