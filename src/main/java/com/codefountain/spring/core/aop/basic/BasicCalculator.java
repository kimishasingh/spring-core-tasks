package com.codefountain.spring.core.aop.basic;

/**
 * Calculator interface
 */
public interface BasicCalculator {

    /**
     * Adds two numbers
     * @param number1
     * @param number2
     * @return
     */
    double addition(double number1, double number2);

    /**
     * Subtracts two numbers
     * @param number1
     * @param number2
     * @return
     */
    double subtraction(double number1, double number2);

    /**
     * Multiplies two numbers
     * @param number1
     * @param number2
     * @return
     */
    double multiplication(double number1, double number2);

    /**
     * Divides two numbers
     * @param number1
     * @param number2
     * @return
     */
    double division(double number1, double number2);
}
