package org.example.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComplexNumber implements CalcNumber {
    private double realPart;
    private double imaginaryPart;

    @Override
    public String getStringValue() {
        return realPart
                + (imaginaryPart >= 0 ? " + " : " ")
                + imaginaryPart
                + " * i";
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
