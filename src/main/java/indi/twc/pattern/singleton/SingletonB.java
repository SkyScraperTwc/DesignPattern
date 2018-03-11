package indi.twc.pattern.singleton;
/**
 * 2、懒汉式，线程安全
 是否 Lazy 初始化：是
 是否多线程安全：是
 实现难度：易
 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 优点：第一次调用才初始化，避免内存浪费。
 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class SingletonB {
    //volatile防止指令重排
    private volatile static SingletonB instance;

    private SingletonB(){}

    //这种写法性能很低,不建议采用
//	public static synchronized Singleton2 getInstance(){
//		if(instance==null){
//			instance = new Singleton2();
//		}
//		return instance;
//	}

    // 对象实例化时与否判断（不使用同步代码块，instance不等于null时，直接返回对象，提高运行效率）
    public static SingletonB getInstance(){
        if(instance==null){
            // 同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (SingletonB.class){
                // 未初始化，则初始instance变量
                if(instance==null){
                    instance = new SingletonB();
                }
            }
        }
        return instance;
    }
}
