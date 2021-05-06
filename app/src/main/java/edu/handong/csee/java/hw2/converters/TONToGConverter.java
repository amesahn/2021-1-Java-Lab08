package edu.handong.csee.java.hw2.converters;

/**
 * TON -> G
 * @author Myunghun Ahn
 */
public class TONToGConverter implements Convertible {

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
     * actual computaion! ton = 1000000g
     */
    public void convert(){
        result = value * 1000 * 1000;
    }
}
