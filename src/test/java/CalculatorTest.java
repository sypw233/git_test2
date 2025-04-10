import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static Calculator calculator = new Calculator();

    @AfterEach
    public void tearDown() {
        calculator.clear();
    }

    @Test
    public void TestAdd() {
        calculator.add(3);
        assertEquals(3, calculator.getResult());
    }

    @Test
    void TestSubstract() {
        calculator.substract(3);
        assertEquals(-3, calculator.getResult());
    }

    @Test
    void TestMultiply() {
        calculator.add(5); // Set initial value to 5
        calculator.multiply(3);
        assertEquals(15, calculator.getResult());
    }

    @Test
    void TestDivide() {
        calculator.add(10); // Set initial value to 10
        calculator.divide(2);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void TestDivideByZero() {
        calculator.add(10);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(0));
    }

    @Test
    void TestSquare() {
        calculator.add(4); // Set initial value to 4
        calculator.square();
        assertEquals(16, calculator.getResult());
    }
}