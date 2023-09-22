package org.example.service;

import org.example.model.CalcNumber;
import org.example.model.ComplexNumber;

public class ComplexCalculatorService implements CalculatorService {
    @Override
    public CalcNumber add(CalcNumber a, CalcNumber b) {
        ComplexNumber aComplexNumber = (ComplexNumber) a;
        ComplexNumber bComplexNumber = (ComplexNumber) b;
        double aReal = aComplexNumber.getRealPart();
        double aIm = aComplexNumber.getImaginaryPart();
        double bReal = bComplexNumber.getRealPart();
        double bIm = bComplexNumber.getImaginaryPart();

        return new ComplexNumber(aReal + bReal, aIm + bIm);
    }

    @Override
    public CalcNumber subtract(CalcNumber a, CalcNumber b) {
        ComplexNumber aComplexNumber = (ComplexNumber) a;
        ComplexNumber bComplexNumber = (ComplexNumber) b;
        double aReal = aComplexNumber.getRealPart();
        double aIm = aComplexNumber.getImaginaryPart();
        double bReal = bComplexNumber.getRealPart();
        double bIm = bComplexNumber.getImaginaryPart();

        return new ComplexNumber(aReal - bReal, aIm - bIm);
    }

    @Override
    public CalcNumber multiply(CalcNumber a, CalcNumber b) {
        ComplexNumber aComplexNumber = (ComplexNumber) a;
        ComplexNumber bComplexNumber = (ComplexNumber) b;
        double aReal = aComplexNumber.getRealPart();
        double aIm = aComplexNumber.getImaginaryPart();
        double bReal = bComplexNumber.getRealPart();
        double bIm = bComplexNumber.getImaginaryPart();

        return new ComplexNumber(aReal * bReal - aIm * bIm, aReal * bIm + aIm * bReal);
    }

    @Override
    public CalcNumber divide(CalcNumber a, CalcNumber b) {
        ComplexNumber aComplexNumber = (ComplexNumber) a;
        ComplexNumber bComplexNumber = (ComplexNumber) b;
        double bReal = bComplexNumber.getRealPart();
        double bIm = bComplexNumber.getImaginaryPart();

        ComplexNumber bConjugate = new ComplexNumber(bReal, -bIm);
        CalcNumber dividend = multiply(aComplexNumber, bConjugate);
        ComplexNumber complexDividend = (ComplexNumber) dividend;
        double divider = bReal * bReal + bIm * bIm;

        return new ComplexNumber(complexDividend.getRealPart() / divider, complexDividend.getImaginaryPart() / divider);
    }
}
