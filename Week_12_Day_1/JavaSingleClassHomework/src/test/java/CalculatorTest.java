import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    int num1;
    int num2;

    @Before
    public void before() {
    calculator = new Calculator();
    num1 = 2;
    num2 = 5;
    }

    @Test
    public void canAdd(){
        int result = calculator.add(num1, num2);
        assertEquals(7, result);
    }

    @Test
    public void canSubtract() {
        int result = calculator.subtract(num2, num1);
        assertEquals(3, result);
    }

    @Test
    public void canMultiply(){
        int result = calculator.multiply(num1, num2);
        assertEquals(10, result);
    }

    @Test
    public void canDivide() {
        double numerator = 5;
        double denominator = 2;
        double result = calculator.divide(numerator, denominator);
        assertEquals(2.5, result, 0.0);
    }
}


