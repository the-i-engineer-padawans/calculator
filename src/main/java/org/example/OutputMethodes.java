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

    public void printAddition(double num1, double num2, double addition) {
        System.out.printf("""
                Your Calculation:
                %s + %s = %s
                %n""", num1, num2, addition);
    }

    public void printSubtraction(double num1, double num2, double subtraction) {
        System.out.printf("""
                Your Calculation:
                %s - %s = %s
                %n""", num1, num2, subtraction);
    }

    public void printMultiplication(double num1, double num2, double multiplication) {
        System.out.printf("""
                Your Calculation:
                %s * %s = %s
                %n""", num1, num2, multiplication);
    }

    public void printDivision(double num1, double num2, double division) {
        System.out.printf("""
                Your Calculation:
                %s / %s = %s
                %n""", num1, num2, division);
    }

    public void printKeepResult(double result) {
        System.out.printf("""
                Do you want to keep this result?
                %s
                \t 1. Yes
                \t 2. No
                """, result);
    }
}
