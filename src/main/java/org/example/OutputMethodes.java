package org.example;

public class OutputMethodes {
    public void printChooseFunction() {
        System.out.println("""
                Choose your function:
                \t 1. Addition
                \t 2. Subtraction
                \t 3. Multiplication
                \t 4. Division
                \t 5. Root
                """);
    }

    public void printEnterNumber1() {
        System.out.println("""
                please enter your first Number:
                """);
    }

    public void printEnterNumber2() {
        System.out.println("""
                please enter your second Number:
                """);
    }

    public void printKeepResult(double result) {
        System.out.printf("""
                Do you want to keep this result?
                %s
                \t 1. Yes
                \t 2. No
                """, result);
    }

    public void printCalculation(double num1, String operator, double num2, double result) {
        System.out.printf("""
                Your Calculation:
                %s %s %s = %s
                %n""", num1, operator, num2, result);

    }

    public void printRoot(double num1, double result) {
        System.out.printf("""
                Your Calculation:
                root(%s) = %s
                %n""", num1, result);

    }


    public void printPositivValue() {
        System.out.println("""
                please enter a positiv number for the root calculation
                """);
    }
}
