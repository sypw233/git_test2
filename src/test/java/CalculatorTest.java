import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private static Calculator calculator=new Calculator();

    @AfterEach  //测试清空方法 结果清空
    public void tearDown(){
        calculator.clear();
    }

    @Test
    public void TestAdd(){
        calculator.add(3);
        assertEquals(3,calculator.getResult());
    }

    @Test
    public void Tsetsubstract() {
        calculator.substract(3);
        assertEquals(-3,calculator.getResult());
    }
}
