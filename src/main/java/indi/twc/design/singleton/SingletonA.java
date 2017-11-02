package indi.twc.design.singleton;
/**
 * 1、懒汉式，线程不安全
 是否 Lazy 初始化：是
 是否多线程安全：否
 实现难度：易
 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @author Administrator
 *
 */
public class SingletonA {

    private static SingletonA singletonA;

    private SingletonA(){

    }
    public static SingletonA getSingletonA() throws InterruptedException{
        if(singletonA==null){
            Thread.sleep(2000);
            singletonA = new SingletonA();
        }
        return singletonA;
    }
}
