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
public class SubstitutionCipher implements Cipher {

    public char[] alphaSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public char[] codexSet = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

    @Override
    public String Encrypt(String msg) {
        if (isValidKey()) {

            char cipherText[] = new char[(msg.length())];
            // for the duration of the message, cycle through the characters
            for (int i = 0; i < msg.length(); i++) {
                for (int j = 0; j < alphaSet.length; j++) {// for each letter in the alphaset
                    // If the if the message char matches the alphaset char code it
                    if (alphaSet[j] == msg.charAt(i)) {
                        cipherText[i] = codexSet[j];
                        break;
                    }
                }
            }
            return new String(cipherText);
        }

        throw new Error("invalid key");
    }

    @Override
    public String Decrypt(String msg) {
        if (isValidKey()) {

            char originalTxt[] = new char[msg.length()];
            for (int i = 0; i < msg.length(); i++) { // for the duration of the message
                for (int j = 0; j < 26; j++) { // for each letter
                    // If the coded char matches the codex char, decode it
                    if (msg.charAt(i) == codexSet[j]) {
                        originalTxt[i] = alphaSet[j];
                        break;
                    }
                }
            }
            return new String(originalTxt);
        }

        throw new Error("invalid key");
    }

    public void setAlphaSet(char[] set) {
        if (isValidSet(set)) {
            alphaSet = set;
        }
    }

    public void setCodexSet(char[] set) {
        if (isValidSet(set)) {
            codexSet = set;
        }
    }

    private boolean isValidSet(char[] set) {
        // Iterates through a char set to determine if its valid.
        // Invalid sets contain duplicatie chars
        int dCount = 0;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                if (i == j) {
                    // we are looking at the same char index, skip over
                    break;
                }
                if (set[i] == set[j]) {
                    dCount++;
                }
            }
        }
        System.out.println("found " + dCount + " duplicates");
        return dCount == 0;
    }

    private boolean isMatchingSets(char[] text, char[] code) {
        int set1 = new String(text).length();
        int set2 = new String(code).length();
        String msg = "";

        if (set1 < set2) {
            msg = "set1 is less than set2 by " + (set2 - set1);
        }

        if (set1 > set2) {
            msg = "set1 is greater than set2 by " + (set1 - set2);
        }

        if (set1 == set2) {
            return true;
        } else {
            System.out.println(msg);
            return false;
        }
    }

    private boolean isValidKey() {
        return isValidSet(alphaSet) && isValidSet(codexSet) && isMatchingSets(alphaSet, codexSet);
    }

    @Override
    public String getKey() {
        return new String(codexSet);
    }

    @Override
    public void setKey(String key) {
        char[] tmp = new char[key.length()];
        for (int i = 0; i < key.length(); i++) {
            tmp[i] = key.charAt(i);
        }
    }

}
