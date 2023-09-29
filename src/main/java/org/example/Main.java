package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static final String ADDITION_OPERATOR = "+";
    public static final String SUBTRACTION_OPERATOR = "-";
    public static final String MULTIPLICATION_OPERATOR = "*";
    public static final String DIVISION_OPERATOR = "/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        String function;
        String keepResultInput;
        Calculator calculator = new Calculator();
        OutputMethodes outputMethodes = new OutputMethodes();

        while (true) {
            outputMethodes.printChooseFunction();
            function = scanner.nextLine();

            if (num1 == 0) {
                outputMethodes.printEnterNumber1();
                num1 = Double.parseDouble(scanner.nextLine());
            }
            if (!Objects.equals(function, "5")) {
                outputMethodes.printEnterNumber2();
                num2 = Double.parseDouble(scanner.nextLine());
            }

            switch (function) {
                case "1" -> {
                    result = calculator.addition(num1, num2);
                    outputMethodes.printCalculation(num1, ADDITION_OPERATOR, num2, result);
                }
                case "2" -> {
                    result = calculator.subtraction(num1, num2);
                    outputMethodes.printCalculation(num1, SUBTRACTION_OPERATOR, num2, result);
                }
                case "3" -> {
                    result = calculator.multiplication(num1, num2);
                    outputMethodes.printCalculation(num1, MULTIPLICATION_OPERATOR, num2, result);
                }
                case "4" -> {
                    result = calculator.division(num1, num2);
                    outputMethodes.printCalculation(num1, DIVISION_OPERATOR, num2, result);
                }
                case "5" -> {
                    if (num1 < 0) {
                        outputMethodes.printPositivValue();
                    } else {
                        result = calculator.root(num1);
                        outputMethodes.printRoot(num1, result);
                    }
                }
                default -> throw new IllegalStateException("Wrong value: " + function);
            }

            outputMethodes.printKeepResult(result);
            keepResultInput = scanner.nextLine();
            if (keepResultInput.equals("1")) {
                num1 = result;
            } else if (keepResultInput.equals("2")) {
                num1 = 0;
            } else {
                throw new IllegalStateException("Wrong value: " + keepResultInput);
            }
        }
    }
}