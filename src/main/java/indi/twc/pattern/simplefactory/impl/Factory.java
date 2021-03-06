package indi.twc.pattern.simplefactory.impl;

import indi.twc.pattern.simplefactory.BMW;

/**
 * 具体工厂类
 */
public class Factory {
    public BMW createBMW(String type){
        if(type.equals("BMW320")){
            return new BMW320();
        }
        if(type.equals("BMW523")){
            return new BMW523();
        }
        return null;
    }
}
