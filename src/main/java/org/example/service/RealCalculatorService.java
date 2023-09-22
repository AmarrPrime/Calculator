package org.example.service;

import org.example.model.CalcNumber;
import org.example.model.RealNumber;

public class RealCalculatorService implements CalculatorService {
    @Override
    public CalcNumber add(CalcNumber a, CalcNumber b) {
        RealNumber aRealNumber = (RealNumber) a;
        RealNumber bRealNumber = (RealNumber) b;
        double aValue = aRealNumber.getValue();
        double bValue = bRealNumber.getValue();

        return new RealNumber(aValue + bValue);
    }

    @Override
    public CalcNumber subtract(CalcNumber a, CalcNumber b) {
        RealNumber aRealNumber = (RealNumber) a;
        RealNumber bRealNumber = (RealNumber) b;
        double aValue = aRealNumber.getValue();
        double bValue = bRealNumber.getValue();

        return new RealNumber(aValue - bValue);
    }

    @Override
    public CalcNumber multiply(CalcNumber a, CalcNumber b) {
        RealNumber aRealNumber = (RealNumber) a;
        RealNumber bRealNumber = (RealNumber) b;
        double aValue = aRealNumber.getValue();
        double bValue = bRealNumber.getValue();

        return new RealNumber(aValue * bValue);
    }

    @Override
    public CalcNumber divide(CalcNumber a, CalcNumber b) {
        RealNumber aRealNumber = (RealNumber) a;
        RealNumber bRealNumber = (RealNumber) b;
        double aValue = aRealNumber.getValue();
        double bValue = bRealNumber.getValue();

        return new RealNumber(aValue / bValue);
    }
}
