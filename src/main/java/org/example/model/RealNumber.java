package org.example.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RealNumber implements CalcNumber {
    private double value;

    @Override
    public String getStringValue() {
        return Double.toString(value);
    }

    public Double getValue() {
        return value;
    }
}
