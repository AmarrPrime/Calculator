package org.example.view;

import org.example.model.CalcNumber;
import org.example.model.RealNumber;

import java.util.Scanner;

public class RealNumberView extends CalculatorView {

    public RealNumberView(Scanner scanner) {
        super(scanner);
    }

    @Override
    public CalcNumber getArgument() {
        System.out.println("Введите число:");
        String result = scanner.next();
        double value = Double.parseDouble(result);

        return new RealNumber(value);
    }

    @Override
    public void showOperation(String mathAction, CalcNumber a, CalcNumber b) {
        System.out.print(a.getStringValue() + " " + mathAction + " " + b.getStringValue() + " = ");
    }
}
