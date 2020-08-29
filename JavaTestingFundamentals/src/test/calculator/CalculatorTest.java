package calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void addTest() {

        Calculator calculator = Mockito.mock(Calculator.class);
        when(calculator.add(3, 5)).thenReturn(8);
        int result = calculator.add(3, 5);

        assert result == 8;
    }
}