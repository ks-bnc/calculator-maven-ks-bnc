package com.mkyong.hashing.service;

public class Operation {
    private final double operand1;
    private final String operator;
    private final double operand2;

    public Operation(double operand1, String operator, double operand2) {
        this.operand1 = operand1;
        this.operator = operator;
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }

    public String getOperator() {
        return operator;
    }

    public double getOperand2() {
        return operand2;
    }
}
