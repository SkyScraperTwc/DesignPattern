import indi.twc.pattern.template.AbstractTemplate;
import indi.twc.pattern.template.impl.ConcreteTemplate;
import org.junit.Test;

public class TemplateTest {
    @Test
    public void testTemplate() {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }
}
