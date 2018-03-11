import indi.twc.pattern.singleton.SingletonA;
import indi.twc.pattern.singleton.SingletonB;
import indi.twc.pattern.singleton.SingletonEnum;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    /**
     * 经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，
     * 才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
     */
    @Test
    public void testSingletonA() throws InterruptedException {
		SingletonA singletonA = SingletonA.getSingletonA();
        System.out.println(singletonA);
    }

    @Test
    public void testSingletonEnum() throws InterruptedException {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.whateverMethod();
    }

    /**
     * 通过反射创建多个对象
     * @throws InterruptedException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void testReflectionAttack() throws InterruptedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor con = SingletonB.class.getDeclaredConstructor();
        con.setAccessible(true);
        SingletonB singletonB = (SingletonB)con.newInstance();
        SingletonB singletonB2 = (SingletonB)con.newInstance();
        System.out.println(singletonB);
        System.out.println(singletonB2);
        System.out.println(singletonB==singletonB2);
    }

    @Test
    public void testReflectionAttack2() throws InterruptedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //防止反射创建对象，NoSuchMethodException
        Constructor con = SingletonEnum.class.getDeclaredConstructor();
        con.setAccessible(true);
        SingletonEnum singletonEnum = (SingletonEnum)con.newInstance();
        System.out.println(singletonEnum);
    }
}
