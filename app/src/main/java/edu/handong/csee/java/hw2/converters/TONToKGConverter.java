package edu.handong.csee.java.hw2.converters;

/**
 * Ton-> KG
 * @author Myunghun Ahn
 */

public class TONToKGConverter implements Convertible {

    private double value;
    private double result;

    /**
     * set variable to initial value.
     * @param fromValue early value, before converting number.
     */
    public void setFromValue(double fromValue) {
        value = fromValue;
    }

    /**
     * return converted value
     * @return converted value!
     */
    public double getConvertedValue() {
        return result;
    }

    /**
     * actual computaion! 1ton = 1000kg
     */
    public void convert(){
        result = value * 1000;
    }
}