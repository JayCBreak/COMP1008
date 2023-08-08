package com.example.comp1008javafx;

import java.util.ArrayList;

public class CalculatorModel {
    private String operand1, operand2, operator;
    private double num1, num2, result;
    private ArrayList<String> allowedOperators = new ArrayList<>();

    public CalculatorModel() {
        allowedOperators.add("+");
        allowedOperators.add("-");
        allowedOperators.add("x");
        allowedOperators.add("/");
    }

    public String getOperand1() {
        return operand1;
    }

    public void setOperand1(String operand1) {
        this.operand1 = operand1;
        setNum1();
    }

    public String getOperand2() {
        return operand2;
    }

    public void setOperand2(String operand2) {
        this.operand2 = operand2;
        setNum2();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        if(allowedOperators.contains(operator.toLowerCase())) {
            this.operator = operator.toLowerCase();
        }
    }

    public double getNum1() {
        return num1;
    }

    private void setNum1() {
        try {
            num1 = Double.parseDouble(operand1);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid Operand 1");
        }
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2() {
        try {
            num2 = Double.parseDouble(operand2);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid Operand 2");
        }
    }

    public double getResult() {
        return result;
    }

    public void setResult() {
        result = switch(operator) {
            case"+": yield num1 + num2;
            case"-": yield num1 - num2;
            case"x": yield num1 * num2;
            case"/": yield num1 / num2;
            default: yield 0;
        };
    }
}
