import indi.twc.pattern.factorymethod.*;
import indi.twc.pattern.factorymethod.impl.BMW000;
import indi.twc.pattern.factorymethod.impl.BMW001;
import indi.twc.pattern.factorymethod.impl.FactoryBMW000;
import indi.twc.pattern.factorymethod.impl.FactoryBMW001;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void testFactoryMethod() {
        FactoryBMW factoryBMW000 = new FactoryBMW000();
        BMW000 bmw000 = (BMW000) factoryBMW000.createBMW();
        bmw000.show();

        FactoryBMW factoryBMW001 = new FactoryBMW001();
        BMW001 bmw001 = (BMW001) factoryBMW001.createBMW();
        bmw001.show();
    }
}
