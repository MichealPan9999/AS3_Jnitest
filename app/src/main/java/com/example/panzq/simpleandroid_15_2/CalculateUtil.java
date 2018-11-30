package com.example.panzq.simpleandroid_15_2;

public class CalculateUtil {

    static{
        System.loadLibrary("Calculate");
    }
    public native double add(double a,double b);
    public native double sub(double a,double b);
    public native double mul(double a,double b);
    public native double div(double a,double b);
}
