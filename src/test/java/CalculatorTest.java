
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testforAddition() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void testforSubtraction() {
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    void testforMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testforDivision() {
        assertEquals(3.0, calculator.divide(6, 2));
    }
}