package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.CalcNumber;
import org.example.service.CalculatorService;
import org.example.view.CalculatorView;

@AllArgsConstructor
public class CalculatorController {
    private CalculatorService realCalculatorService;
    private CalculatorService complexCalculatorService;
    private CalculatorView realNumberView;
    private CalculatorView complexNumberView;

    public void calculate() {
        CalculatorView view = realNumberView;
        CalculatorService service = null;
        String numberType = view.chooseNumberType();
        if (numberType.equals("r")) {
            view = realNumberView;
            service = realCalculatorService;
        } else {
            view = complexNumberView;
            service = complexCalculatorService;
        }

        String mathAction = view.chooseMathAction();
        CalcNumber a = view.getArgument();
        CalcNumber b = view.getArgument();
        view.showOperation(mathAction, a, b);

        CalcNumber result = getResult(mathAction, a, b, service);
        view.showResult(result);
    }

    private CalcNumber getResult(String mathAction, CalcNumber a, CalcNumber b, CalculatorService service) {
        switch (mathAction) {
            case "+":
                return service.add(a, b);
            case "-":
                return service.subtract(a, b);
            case "*":
                return service.multiply(a, b);
            case "/":
                return service.divide(a, b);
        }

        return null;
    }
}
