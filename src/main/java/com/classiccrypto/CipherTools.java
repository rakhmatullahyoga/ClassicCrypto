/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classiccrypto;

/**
 *
 * @author Rakhmatullah Yoga S
 */
public class CipherTools {
    
    static String encryptVigenereStandard(String plain, String key) {
        int skip = 0;
        char[] cipher = new char[plain.length()];
        
        plain = plain.toUpperCase();
        key = key.toUpperCase();
        for(int i=0; i<plain.length(); i++) {
            if(plain.charAt(i)==' ') {
                skip++;
                cipher[i] = plain.charAt(i);
            }
            else
                cipher[i] = (char) (65 + ((int) plain.charAt(i) - 65 + key.charAt((i-skip)%key.length()) - 65) % 26);
        }
        return String.valueOf(cipher);
    }
    
    static String decryptVigenereStandard(String cipher, String key) {
        int skip = 0;
        char[] plain = new char[cipher.length()];
        
        cipher = cipher.toUpperCase();
        key = key.toUpperCase();
        for(int i=0; i<cipher.length(); i++) {
            if(cipher.charAt(i)==' ') {
                skip++;
                plain[i] = cipher.charAt(i);
            }
            else
                plain[i] = (char) (65 + (26 + ((int) cipher.charAt(i) - 65 - ((int) key.charAt((i-skip)%key.length()) - 65))) % 26);
        }
        return String.valueOf(plain);
    }
    
    static String encryptVigenereExtended(String plain, String key) {
        int skip = 0;
        char[] cipher = new char[plain.length()];
        for(int i=0; i<plain.length(); i++) {
            if(plain.charAt(i)==' ') {
                skip++;
                cipher[i] = plain.charAt(i);
            }
            else {
                cipher[i] = (char) (((int) plain.charAt(i) + (int) key.charAt((i-skip)%key.length())) % 256);
            }
        }
        return String.valueOf(cipher);
    }
    
    static String decryptVigenereExtended(String cipher, String key) {
        int skip = 0;
        char[] plain = new char[cipher.length()];
        for(int i=0; i<cipher.length(); i++) {
            if(cipher.charAt(i)==' ') {
                skip++;
                plain[i] = cipher.charAt(i);
            }
            else {
                plain[i] = (char) (((int) cipher.charAt(i) - (int) key.charAt((i-skip)%key.length()) + 256) % 256);
            }
        }
        return String.valueOf(plain);
    }
    
}
