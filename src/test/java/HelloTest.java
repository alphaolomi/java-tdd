
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testThatGradleIsGreeted() {
        assertEquals("Hello, world!", new Hello().sayHello());
    }
}
