import indi.twc.pattern.observer.impl.BinaryObserver;
import indi.twc.pattern.observer.impl.OctalObserver;
import indi.twc.pattern.observer.impl.Subject;
import org.junit.Test;

public class ObserverTest {
    @Test
    public void testObserver() {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        subject.setState(5);
        subject.setState(20);
    }
}
