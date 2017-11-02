package indi.twc.design.factorymethod;

public class FactoryBMW000 implements FactoryBMW {
    @Override
    public BMWSEC createBMW() {
        return new BMW000();
    }
}
