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
public class Angle {
    private double degree = 0;
    
    public Angle() {
        degree = 0;
    }
    public Angle(double x) {
        degree = x;
    }
    
    
    public double get() {
        return degree;
    }
    public void set(double x) {
        degree = x;
    }
    public String toString() {
        return String.valueOf(degree);
    }
    public double simplify() {
        double x = degree;
        
        if(x > 360) {
            while(x > 360) {
                x = x-360;
            }
        }
        if(x < -360) {
            while(x < -360) {
                x = x+360;
            }
        }
        
        return x;
    }
    public double rotations() {
        return degree/360;
    }
    public static Angle randomAngle() {
        double degree;
        degree = 360 * Math.random();
        degree = Math.round(degree);
        
        return new Angle(degree);
    }
    
    // Arithmetic operations
    public static Angle add(Angle a, Angle b) {
        Angle c = new Angle(a.get() + b.get() );
        return c;
    }
    public static Angle subtract(Angle a, Angle b) {
        Angle c = new Angle(a.get() - b.get());
        return c;
    }
    public static Angle multiply(Angle a, Angle b) {
        Angle c = new Angle(a.get() * b.get() );
        return c;
    }
    public static Angle divide(Angle a, Angle b) {
        if(b.get() == 0) 
        {
            throw new IllegalArgumentException("cant divide by zero");
        }
        Angle c = new Angle(a.get() / b.get() );
        return c;
    }
    
    // Logical Operators
    public static boolean equal(Angle a, Angle b) {
        return (a.get() == b.get())? true : false;
    }
    public static boolean not(Angle a, Angle b) {
        return (a.get() != b.get())? true : false;
    }
    public static boolean greaterThan(Angle a, Angle b) {
        return (a.get() > b.get())? true : false;
    }
    public static boolean lessThan(Angle a, Angle b) {
        return (a.get() < b.get())? true : false;
    }
    public static boolean greaterThanOrEqualTo(Angle a, Angle b) {
        return (a.get() >= b.get())? true : false;
    }
    public static boolean lessThanOrEqualTo (Angle a, Angle b) {
        return (a.get() <= b.get())? true:false;
    }
    
}
