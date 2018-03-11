import indi.twc.pattern.simplefactory.BMW;
import indi.twc.pattern.simplefactory.impl.BMW320;
import indi.twc.pattern.simplefactory.impl.Factory;
import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory() {
        Factory factory = new Factory();
        BMW bmw = (BMW320) factory.createBMW("BMW320");
    }
}
