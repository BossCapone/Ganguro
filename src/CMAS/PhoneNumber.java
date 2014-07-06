/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CMAS;

/**
 *
 * @author Eric
 * 
 * @description:
 *  Number object to contain and format string numbers like phone numbers, credit card numbers, and 
 */
public class PhoneNumber implements Number {
    String type = "phone number";
    String number = "";
    int length = 10;
    int lengthMin = 7;
    String format = "xxx-xxx-xxxx";
    static char x = 'x';
    static char s = '-';
    
    
    public PhoneNumber() {
        number = "0000000000";
    }
    public PhoneNumber(String num) {
        if(isFormatted(num)) {
            setNumber(num);
        }
    }
    public PhoneNumber(int num) {
        String tmp = String.valueOf(num);
        if(isFormatted(tmp))
        {
            number = tmp;
        }
        else
            throw new IllegalArgumentException("bad phone number");
    }
    
    
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String num) {
        if(isFormatted(num))
            number = num;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int size) {
        length = size;
    }

    @Override
    public void setLength(int min, int max) {
        length = max;
        lengthMin = min;
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public void setFormat(String fmat) {
       throw new UnsupportedOperationException("Cannot format a phone number.");
    }
    
    private boolean isFormatted(String fmat) {
        if(fmat.length()== 10 || fmat.length() == 7)
            return true;       
        else
            return false;
    }
    
    @Override
    public String toString() {
       if(number.length() == 10)
           return toString10();
       if(number.length() == 7)
           return toString7();
       else
           return null;
    }
    public String toString10() {
        String num = "";
        char index;


        for(int i=0, j=0; i<format.length(); i++) {
            
            index = format.charAt(i);
            
            
            if(format.charAt(i) == x) // index is a number
            {
                char digit = number.charAt(j);
                j++;
                num = num.concat(String.valueOf(digit));
                //System.out.print("  number: "+digit);
            }
                
            if(index == s) // index is a dash
            {
                num = num.concat("-");
            }
            //System.out.println();
            
            
        }
        //System.out.println("num: "+ num);
        return num;
    }
    public String toString7() {
        String num = "";
        String format2 = format.substring(4);
        char index;
        

        for(int i=0, j=0; i<format2.length(); i++) {
            
            index = format2.charAt(i);
            
            
            if(format2.charAt(i) == x) // index is a number
            {
                char digit = number.charAt(j);
                j++;
                num = num.concat(String.valueOf(digit));
                //System.out.print("  number: "+digit);
            }
                
            if(index == s) // index is a dash
            {
                num = num.concat("-");
            }
            //System.out.println();
            
            
        }
        //System.out.println("num: "+ num);
        return num;
    }
}