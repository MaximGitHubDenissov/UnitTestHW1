package main.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Devider can not by zero");
        }
        return (double) a / b;
    }
    public double calculateDiscount (double ammount, double discount){
        if (discount < 0){
            throw new ArithmeticException("Скидка не может быть ниже нуля");
        }
        return ammount - ammount*discount;
    }
}
