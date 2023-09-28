import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCalculator {
    Calculator calculator = new Calculator();
    double num1 = 9;
    double num2 = 10;
    @Test
    public void testAddition(){

        double expectedOutput = num1 + num2;
        double actualOutput = calculator.addition(num1,num2);

        assertEquals(expectedOutput, actualOutput, 0);
    }

    @Test
    public void testSubtraction(){
        double expectedOutput = num1 - num2;
        double actualOutput = calculator.subtraction(num1,num2);

        assertEquals(expectedOutput, actualOutput, 0);
    }

    @Test
    public void testMultiplication(){
        double expectedOutput = num1 * num2;
        double actualOutput = calculator.multiplication(num1,num2);

        assertEquals(expectedOutput, actualOutput, 0);
    }

    @Test
    public void testDivision(){
        double expectedOutput = num1 / num2;
        double actualOutput = calculator.division(num1,num2);

        assertEquals(expectedOutput, actualOutput, 0);
    }
    @Test
    public void testRoot(){
        double expectedOutput = Math.sqrt(num1);
        double actualOutput = calculator.root(num1);

        assertEquals(expectedOutput, actualOutput, 0);
    }
}
