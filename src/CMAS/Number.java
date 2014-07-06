/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CMAS;

/**
 *
 * @author Eric
 */
public interface Number {
    /*
    * @param type - the label of what the number represents
    * @param number - the string value of the number
    * @param length - the maximum required length for the number to be
    * @param lengthMin - the mimimum length the mumber is to be
    * @param format - the string format represented by 'x' and '-' (xxx-xxx-xxxx)
    * 
    * Example numbers:
    *   phone - xxx-xxx-xxxx
    *   phone - xxx-xxxx
    *   card  - xxxx-xxxx-xxxx-xxxx
    */
    
    
    public String getType();    // Get the number type label
    public void setType(String type);   //Sets the number type label
    
    public String getNumber();     // get the interger value of the number
    public void setNumber(String num); //set the interger value of the number
    
    public int getLength(); // Get the length of the number (phone-10, card-16)
    public void setLength(int size);    // Set the required length of the number
    public void setLength(int min, int max);    // set the length range of the number(phone[7-10] +/- areacode[3])
    
    public String getFormat();  // return a sample format for the number
    public void setFormat(String fmat);    //Format the number string based on type
    
    
    // return the number in its unique format
    @Override
    public String toString();
    
}
