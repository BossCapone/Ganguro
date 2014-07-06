/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cipher;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class CaesarCipher implements Cipher {
    int shiftKey = 0;

    public CaesarCipher() {
        shiftKey = (int) (Math.random() * 100);
    }

    public CaesarCipher(int key) {
        shiftKey = key;
    }

    @Override
    public String getKey() {
        return String.valueOf(shiftKey);
    }

    @Override
    public void setKey(String k) {
        shiftKey = Integer.parseInt(k);
    }

    @Override
    public String Encrypt(String txt) {
        // Encrypt the ciphers given text using the stored key
        // The cipher text will be returned with the key attached.
        String convertedTxt = "";
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, shiftKey);
        }
        return convertedTxt;
    }

    public String Encrypt(String txt, int key) {
        // Encrypt the ciphers given text using a random key
        // The cipher text will be returned with the key attached.
        String convertedTxt = "";
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, key);
        }
        return convertedTxt;
    }

    @Override
    public String Decrypt(String txt) {
        // Decode the ciphertext using the stored key
        // retults are displayed
        String convertedTxt = "";
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, -shiftKey);
        }
        return convertedTxt;
    }

    public String Decrypt(String txt, int key) {
        // Decode the given ciphertext using the given key
        // retults are displayed not stored
        String convertedTxt = "";
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, -key);
        }
        return convertedTxt;
    }

    private char shift(char letter, int value) {
        return (char) (letter + value);
    }
}
