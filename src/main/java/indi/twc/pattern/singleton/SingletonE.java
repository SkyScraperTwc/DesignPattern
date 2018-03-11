package indi.twc.pattern.singleton;

/**
 * @author Administrator
 *
 * 匿名内部类写法，线程安全，懒加载
 */

public class SingletonE {

    private SingletonE(){}

    static {
        System.out.println("SingletonE.....static");
    }

    public static SingletonE getInstance(){
        return LazyHolder.instance;
    }

    public static void print(){
        System.out.println("SingletonE------");
    }

    private static class LazyHolder{

        private static final SingletonE instance = new SingletonE();

        static {
            System.out.println(instance);
        }
    }
}

