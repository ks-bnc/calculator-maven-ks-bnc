package com.mkyong.hashing.ui;

import com.mkyong.hashing.service.Operation;
import com.mkyong.hashing.service.Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Userinterface {
    private static final String ERROR_SIGN = "-";
    private final Calculator calculator;

    public Userinterface(Calculator calculator) {
        this.calculator = calculator;
    }

    public void processOperation(){
        String eredmeny = ERROR_SIGN;
        try {
            Operation operation = getOperation();
            if ("+".equals(operation.getOperator())) {
                eredmeny = String.format("%f",
                        calculator.osszead(operation.getOperand1(), operation.getOperand2()));
            }
            if ("-".equals(operation.getOperator())) {
                eredmeny = String.format("%f",
                        calculator.kivon(operation.getOperand1(), operation.getOperand2()));
            }
            if ("*".equals(operation.getOperator())) {
                eredmeny = String.format("%f",
                        calculator.szoroz(operation.getOperand1(), operation.getOperand2()));
            }
            if ("/".equals(operation.getOperator())) {
                eredmeny = String.format("%f",
                        calculator.oszt(operation.getOperand1(), operation.getOperand2()));
            }
        } catch (Exception ex) { }
        printOut(eredmeny);
    }

    private String getLine() {
        return new BufferedReader(
                new InputStreamReader(System.in, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));
    }

    private Operation getOperation() {
        String line = getLine();
        String[] parts = line.split(" ");

        return new Operation(
                Double.parseDouble(parts[0]),
                parts[1],
                Double.parseDouble(parts[2]));
    }

    private void printOut(String message){
        System.out.println(message);
    }
}
