import org.example.Calculator;
import org.example.OutputMethodes;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class testOutputMethodes {
    @Test
    public void testPrintChooseFunction() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        OutputMethodes outputMethodes = new OutputMethodes();

        outputMethodes.printChooseFunction();

        System.setOut(System.out);
        String expectedOutput = """
                Choose your function:
                \t 1. Addition
                \t 2. Subtraction
                \t 3. Multiplication
                \t 4. Division
                \t 5. Root
                """;
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testPrintEnterNumber1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        OutputMethodes outputMethodes = new OutputMethodes();

        outputMethodes.printEnterNumber1();

        System.setOut(System.out);
        String expectedOutput = """
                please enter your first Number:
                """;
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testPrintEnterNumber2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        OutputMethodes outputMethodes = new OutputMethodes();

        outputMethodes.printEnterNumber2();

        System.setOut(System.out);
        String expectedOutput = """
                please enter your second Number:
                """;
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testPrintAddition() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Calculator calculator = new Calculator();

        OutputMethodes outputMethodes = new OutputMethodes();
        double num1 = 2;
        double num2 = 3;
        double result = calculator.addition(num1, num2);

        outputMethodes.printAddition(num1, num2, result);

        System.setOut(System.out);
        String expectedOutput = String.format("""
                Your Calculation:
                %s + %s = %s
                %n""", num1, num2, result);
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testPrintSubtraction() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Calculator calculator = new Calculator();

        OutputMethodes outputMethodes = new OutputMethodes();
        double num1 = 2;
        double num2 = 3;
        double result = calculator.subtraction(num1, num2);

        outputMethodes.printSubtraction(num1, num2, result);

        System.setOut(System.out);
        String expectedOutput = String.format("""
                Your Calculation:
                %s - %s = %s
                %n""", num1, num2, result);
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testPrintMultiplication() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Calculator calculator = new Calculator();

        OutputMethodes outputMethodes = new OutputMethodes();
        double num1 = 2;
        double num2 = 3;
        double result = calculator.multiplication(num1, num2);

        outputMethodes.printMultiplication(num1, num2, result);

        System.setOut(System.out);
        String expectedOutput = String.format("""
                Your Calculation:
                %s * %s = %s
                %n""", num1, num2, result);
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testDivision() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Calculator calculator = new Calculator();

        OutputMethodes outputMethodes = new OutputMethodes();
        double num1 = 2;
        double num2 = 3;
        double result = calculator.division(num1, num2);

        outputMethodes.printDivision(num1, num2, result);

        System.setOut(System.out);
        String expectedOutput = String.format("""
                Your Calculation:
                %s - %s = %s
                %n""", num1, num2, result);
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }
}
