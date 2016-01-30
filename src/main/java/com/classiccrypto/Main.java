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
        String key = "sony";
        String encrypted, decrypted;
        
        System.out.println("Text : "+plain);
        encrypted = CipherTools.encryptVigenereStandard(plain, key);
        System.out.println("Encrypted code :" + encrypted);
        decrypted = CipherTools.decryptVigenereStandard(encrypted, key);
        System.out.println("Decrypted code :" + decrypted);
    }
}
