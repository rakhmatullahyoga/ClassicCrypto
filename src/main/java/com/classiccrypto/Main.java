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
public class Main {
    public static void main(String[] args) {
        String plain = "THIS PLAIN TEXT";
        String key = "Sony";
        String encrypted, decrypted;
        
        System.out.println("Text : "+plain);
        System.out.println("-----------------Standard Vigenere-----------------");
        encrypted = CipherTools.encryptVigenereStandard(plain, key);
        System.out.println("Encrypted code :" + encrypted);
        System.out.println("Encrypted code :" + CipherTools.removeSpaces(encrypted));
        System.out.println("Encrypted code :" + CipherTools.groupFiveChars(encrypted));
        decrypted = CipherTools.decryptVigenereStandard(encrypted, key);
        System.out.println("Decrypted code :" + decrypted);
        System.out.println("Decrypted code :" + CipherTools.removeSpaces(decrypted));
        System.out.println("Decrypted code :" + CipherTools.groupFiveChars(decrypted));
        
        System.out.println("-----------------Extended Vigenere-----------------");
        encrypted = CipherTools.encryptVigenereExtended(plain, key);
        System.out.println("Encrypted code :" + encrypted);
        System.out.println("Encrypted code :" + CipherTools.removeSpaces(encrypted));
        System.out.println("Encrypted code :" + CipherTools.groupFiveChars(encrypted));
        decrypted = CipherTools.decryptVigenereExtended(encrypted, key);
        System.out.println("Decrypted code :" + decrypted);
        System.out.println("Decrypted code :" + CipherTools.removeSpaces(decrypted));
        System.out.println("Decrypted code :" + CipherTools.groupFiveChars(decrypted));
        
        plain = "GOOD BROOMS SWEEP CLEAN";
        key = "STANDERCHBK";
        System.out.println("-----------------Playfair Cipher-----------------");
        System.out.println("Text : "+plain);
        encrypted = CipherTools.encryptPlayfair(plain, key);
        System.out.println("Encrypted code : "+ encrypted);
        System.out.println("Encrypted code : "+ CipherTools.removeSpaces(encrypted));
        System.out.println("Encrypted code : "+ CipherTools.groupFiveChars(encrypted));
        decrypted = CipherTools.decryptPlayfair(encrypted, key);
        System.out.println("Decrypted code :" + decrypted);
        System.out.println("Decrypted code :" + CipherTools.removeSpaces(decrypted));
        System.out.println("Decrypted code :" + CipherTools.groupFiveChars(decrypted));
        
    }
}
