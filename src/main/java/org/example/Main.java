package org.example;

import org.example.controller.CalculatorController;
import org.example.service.ComplexCalculatorService;
import org.example.service.RealCalculatorService;
import org.example.view.ComplexNumberView;
import org.example.view.RealNumberView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController controller = new CalculatorController(new RealCalculatorService(), new ComplexCalculatorService(),
                new RealNumberView(scanner), new ComplexNumberView(scanner));
        String ans = "";
        while (!ans.equals("n")) {
            controller.calculate();
            System.out.println("Хотите продолжить? y/n: ");
            ans = scanner.next();
        }
        scanner.close();
    }
}