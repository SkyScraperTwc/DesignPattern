package indi.twc.design.factory;

/**
 * 具体工厂类ColorFactory
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType){
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }
}
