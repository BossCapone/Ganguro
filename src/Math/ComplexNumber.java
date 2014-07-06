/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Math;

/**
 *
 * @author Eric
 */
public class ComplexNumber  {
    private double real;
    private double imaginary;
    
    public ComplexNumber() {
        real = 0;
        imaginary = 0;
    }
    public ComplexNumber(double a, double b) {
        real = a;
        imaginary = b;
    }
    
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void setReal(double r) {
        real = r;
    }
    public void setImaginary(double i) {
        imaginary = i;
    }
    @Override
    public String toString() {
        String sign = (imaginary < 0) ? "-" : "+";
        return real +sign + Math.abs(imaginary)+"i";
    }
    
    //arithmetic operatiors 
    public static ComplexNumber add (ComplexNumber x, ComplexNumber y) {
        return new ComplexNumber(x.getReal()+ y.getReal(), x.getImaginary()+y.getImaginary() );
    }
    public static ComplexNumber subtract (ComplexNumber x, ComplexNumber y) {
        return new ComplexNumber(x.getReal()-y.getReal(),x.getImaginary()-y.getImaginary());
    }
    public static ComplexNumber multiply (ComplexNumber x, ComplexNumber y) { 
        return new ComplexNumber( (x.getReal()*y.getReal())-(x.getImaginary()*y.getImaginary()),
                (x.getReal()*y.getImaginary())+(y.getReal()*x.getImaginary()));
    }
    public static ComplexNumber divide (ComplexNumber x, ComplexNumber y ) {
        if( (y.getReal()==0 && y.getImaginary()==0) ) {
            throw new ArithmeticException("Divide by 0");
        }
        return new ComplexNumber(( x.getReal()*y.getReal() +x.getImaginary()*y.getImaginary()) / (y.getReal()*y.getReal() + y.getImaginary()*y.getImaginary()),
        (y.getReal()*x.getImaginary() - x.getReal()*y.getImaginary()) / (y.getReal()*y.getReal() + y.getImaginary()*y.getImaginary() ));
    }
    
    // logical operators
    
}
