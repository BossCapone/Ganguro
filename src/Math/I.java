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
// http://en.wikipedia.org/wiki/Imaginary_number
public class I {

    public static String pow(double i) {
        //Raise this i to the given power
        
        if (i < 0) {
            if (i % 4 == 0) {
                return "1";
            }
            if (i % 4 == -1) {
                return "-i";
            }
            if (i % 4 == -2) {
                return "-1";
            }
            if (i % 4 == -3) {
                return "i";
            }
        }

        if (i % 4 == 0) {
            return "1";
        }
        if (i % 4 == 1) {
            return "i";
        }
        if (i % 4 == 2) {
            return "-1";
        }
        if (i % 4 == 3) {
            return "-i";
        }

        return null;
    }
    public static ComplexNumber multiply(ComplexNumber num) {
        return new ComplexNumber(-num.getImaginary(), num.getReal() );
    }
    public static ComplexNumber divide(ComplexNumber num) {
        return new ComplexNumber(num.getImaginary(), -num.getReal() );
    }
}

      


