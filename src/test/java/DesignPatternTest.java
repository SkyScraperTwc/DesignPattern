import indi.twc.design.adapter.AudioPlayer;
import indi.twc.design.factory.*;
import indi.twc.design.factorymethod.*;
import indi.twc.design.observer.BinaryObserver;
import indi.twc.design.observer.OctalObserver;
import indi.twc.design.observer.Subject;
import indi.twc.design.proxy.Image;
import indi.twc.design.proxy.ProxyImage;
import indi.twc.design.simplefactory.BMW;
import indi.twc.design.simplefactory.BMW320;
import indi.twc.design.simplefactory.Factory;
import indi.twc.design.strategy.Context;
import indi.twc.design.strategy.OperationAdd;
import indi.twc.design.strategy.OperationSub;
import indi.twc.design.template.AbstractTemplate;
import indi.twc.design.template.ConcreteTemplate;
import org.junit.Test;

public class DesignPatternTest {
	@Test
	public void testFactory() {
		ShapeFactory shapeFactory = (ShapeFactory) FactoryCreator.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape("SQUARE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		ColorFactory colorFactory = (ColorFactory) FactoryCreator.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		color1.fill();
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
	}

	@Test
	public void testAdapter() {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("vlc", "twctwctwc");
		audioPlayer.play("mp3", "twctwctwc11");
		audioPlayer.play("mp4", "twctwctwc22");
	}

	@Test
	public void testFactoryMethod() {
		FactoryBMW factoryBMW000 = new FactoryBMW000();
		BMW000 bmw000 = (BMW000) factoryBMW000.createBMW();
		bmw000.show();

		FactoryBMW factoryBMW001 = new FactoryBMW001();
		BMW001 bmw001 = (BMW001) factoryBMW001.createBMW();
		bmw001.show();
	}


	@Test
	public void testObserver() {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObserver(subject);
		subject.setState(10);
		subject.setState(20);
	}

	@Test
	public void testProxy() {
		Image image = new ProxyImage("123");
		image.display();
	}

	@Test
	public void testSimpleFactory() {
		Factory factory = new Factory();
		BMW bmw = (BMW320) factory.createBMW("BMW320");
	}

	/**
	 * 经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，
	 * 才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
	 */
	@Test
	public void testSingleton() {

	}

	/**
	 * 最最直观的区别应该是，工厂模式里用户最终使用的是工厂“生产”出来的类的对象，策略模式里用户最终使用的是“配置”了某一策略的Context对象。
	 * 其实一句话就能说得很清楚——工厂模式是创建型的设计模式，它接受指令，创建出符合要求的实例；而策略模式是行为型的设计模式，它接受已经创建好的实例，实现不同的行为。
	 * @author Administrator
	 *
	 */
	@Test
	public void testStrategy() {
		Context context = new Context();

		//OperationAdd策略
		context.setStrategy(new OperationAdd());
		System.out.println(context.executeOperation(1, 6));

		//OperationSub策略
		context.setStrategy(new OperationSub());
		System.out.println(context.executeOperation(2, 10));
	}

	@Test
	public void testTemplate() {
		AbstractTemplate template = new ConcreteTemplate();
		template.templateMethod();
	}
}



