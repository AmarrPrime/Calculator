package org.example.view;

import org.example.model.CalcNumber;
import org.example.model.ComplexNumber;

import java.util.Scanner;

public class ComplexNumberView extends CalculatorView {

    public ComplexNumberView(Scanner scanner) {
        super(scanner);
    }

    @Override
    public CalcNumber getArgument() {
        System.out.println("Введите действительную часть числа:");
        double realPart = getValue();
        System.out.println("Введите мнимую часть числа:");
        double imaginaryPart = getValue();
        ComplexNumber number = new ComplexNumber(realPart, imaginaryPart);
        System.out.println(number.getStringValue());

        return number;
    }

    private double getValue() {
        String result = scanner.next();

        return Double.parseDouble(result);
    }

    @Override
    public void showOperation(String mathAction, CalcNumber a, CalcNumber b) {
        System.out.print("(" + a.getStringValue() + ") " + mathAction + " (" + b.getStringValue() + ") = ");
    }
}
