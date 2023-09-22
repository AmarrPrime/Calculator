package org.example.view;

import lombok.AllArgsConstructor;
import org.example.model.CalcNumber;

import java.util.Scanner;

@AllArgsConstructor
public abstract class CalculatorView {
    protected Scanner scanner;

    public final String chooseNumberType() {
        showMainMenu();
        String result = scanner.next();

        return result;
    }

    private void showMainMenu() {
        System.out.println("Выберите тип чисел, с которыми будете работать: ");
        System.out.println("\tr - действительные числа");
        System.out.println("\tc - комплексные числа");
    }

    public final String chooseMathAction() {
        showActionMenu();
        String result = scanner.next();

        return result;
    }
    private void showActionMenu() {
        System.out.println("Выберите математическое действие: ");
        System.out.println("'+' - сложение\t'-' - вычитание\t'*' - умножение\t'/' - деление");
    }

    public abstract CalcNumber getArgument();
    public abstract void showOperation(String mathAction, CalcNumber a, CalcNumber b);
    public void showResult(CalcNumber result) {
        System.out.println(result.getStringValue());
    }
}
