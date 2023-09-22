package org.example.service;

import org.example.model.CalcNumber;

public interface CalculatorService {
    CalcNumber add(CalcNumber a, CalcNumber b);
    CalcNumber subtract(CalcNumber a, CalcNumber b);
    CalcNumber multiply(CalcNumber a, CalcNumber b);
    CalcNumber divide(CalcNumber a, CalcNumber b);
}
