/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cipher;

/**
 *
 * @author Eric
 */
public interface Cipher {
    public String Encrypt(String msg);
    public String Decrypt(String msg);
    public String getKey();
    public void setKey(String key);
}
