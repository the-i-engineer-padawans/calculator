package org.example;

import java.util.Scanner;

public class Main {
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
            outputMethodes.printEnterNumber2();
            num2 = Double.parseDouble(scanner.nextLine());

            switch (function) {
                case "1" -> {
                    result = calculator.addition(num1, num2);
                    outputMethodes.printAddition(num1, num2, result);
                }
                case "2" -> {
                    result = calculator.subtraction(num1, num2);
                    outputMethodes.printSubtraction(num1, num2, result);
                }
                case "3" -> {
                    result = calculator.multiplication(num1, num2);
                    outputMethodes.printMultiplication(num1, num2, result);
                }
                case "4" -> {
                    result = calculator.division(num1, num2);
                    outputMethodes.printDivision(num1, num2, result);
                }
                case "5" -> {
                    result = calculator.root(num1);
                    outputMethodes.printAddition(num1, num2, result);
                }
                default -> throw new IllegalStateException("Wrong value: " + function);
            }

            outputMethodes.printKeepResult(result);
            keepResultInput = scanner.nextLine();
            if (keepResultInput.equals("1")) {
                num1 = result;
                num2 = 0;
            } else if (keepResultInput.equals("2")) {
                num1 = 0;
                num2 = 0;
            } else {
                throw new IllegalStateException("Wrong value: " + keepResultInput);
            }
            result = 0.0;
        }
    }
}