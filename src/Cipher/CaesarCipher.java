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
public class CaesarCipher {

    int shiftKey = 0;
    String originalTxt;
    String cipherTxt;

    public CaesarCipher() {
        shiftKey = 3;
    }

    public CaesarCipher(int key) {
        shiftKey = key;
    }

    public CaesarCipher(int key, String msg) {
        shiftKey = key;
        originalTxt = msg;
    }

    public int getKey() {
        return shiftKey;
    }

    public void setKey(int k) {
        shiftKey = k;
    }

    public void setOriginalText(String txt) {
        originalTxt = txt;
    }

    public String Encode() {
        // Enode the ciphers original text using the given key
        // The cipher text will also be stored within the cipher
        String convertedTxt = "";
        for (int i = 0; i < originalTxt.length(); i++) {
            char letter = originalTxt.charAt(i);
            convertedTxt += shift(letter, shiftKey);
        }
        cipherTxt = convertedTxt;
        return cipherTxt;
    }

    public String Encode(String txt) {
        // Encode the ciphers given text using a random key
        // The cipher text will be returned with the key attached.
        String convertedTxt = "";
        int tmpKey = (int) (Math.random() * 100);
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, tmpKey);
        }
        return convertedTxt + " key:" + tmpKey;
    }

    public String Encode(String txt, int key) {
        // Encode the ciphers given text using a random key
        // The cipher text will be returned with the key attached.
        String convertedTxt = "";
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, key);
        }
        return convertedTxt;
    }

    public String Decode() {
        // Decode the stored ciphertext using the stored key
        // retults are displayed not stored
        String convertedTxt = "";
        for (int i = 0; i < cipherTxt.length(); i++) {
            char letter = cipherTxt.charAt(i);
            convertedTxt += shift(letter, -shiftKey);
        }
        return convertedTxt;
    }

    public String Decode(String txt, int key) {
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
