import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FirstJUnitTest {
    @Test
    void addition() {
        assertEquals(10, Main.add(4, 6));
    }
}
