package indi.twc.design.factorymethod;

public class FactoryBMW001 implements FactoryBMW {

    @Override
    public BMWSEC createBMW() {
        return new BMW001();
    }
}
