import indi.twc.pattern.proxy.dynamic.Book;
import indi.twc.pattern.proxy.dynamic.BookInterface;
import indi.twc.pattern.proxy.dynamic.BookProxy;
import indi.twc.pattern.proxy.state.Image;
import indi.twc.pattern.proxy.cglib.BookCgLib;
import indi.twc.pattern.proxy.cglib.BookImpl;
import indi.twc.pattern.proxy.cglib.CgLibProxy;
import indi.twc.pattern.proxy.state.ProxyImage;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void testProxy() {
        Image image = new ProxyImage("123");
        image.display();
    }

    @Test
    public void testDynamicProxy() {
        Book book = new Book();
        BookProxy bookProxy = new BookProxy();
        BookInterface bookInterface = (BookInterface) bookProxy.bind(book);
        bookInterface.addBook();
    }

    @Test
    public void testCgLib() {
        CgLibProxy proxy = new CgLibProxy();
        proxy.query();
    }

    @Test
    public void testCgLib2() {
        BookImpl book = new BookImpl();
        BookCgLib cgLib = new BookCgLib();
        BookImpl bookCgLib = (BookImpl) cgLib.getInstance(book);
        bookCgLib.addBook();
    }
}
