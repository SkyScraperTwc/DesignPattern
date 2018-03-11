
import indi.twc.pattern.decorator.Circle;
import indi.twc.pattern.decorator.Rectangle;
import indi.twc.pattern.decorator.RedShapeDecorator;
import indi.twc.pattern.decorator.impl.Shape;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testDecorator() {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        System.out.println("----------");

        redCircle.draw();
        System.out.println("----------");

        redRectangle.draw();
        System.out.println("----------");
    }

}
