package indi.twc.pattern.factorymethod.impl;

import indi.twc.pattern.factorymethod.BMWSEC;
import indi.twc.pattern.factorymethod.FactoryBMW;

public class FactoryBMW000 implements FactoryBMW {
    @Override
    public BMWSEC createBMW() {
        return new BMW000();
    }
}
