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
            if(plain.charAt(i)<65||plain.charAt(i)>90) {
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
            if(cipher.charAt(i)<65||cipher.charAt(i)>90) {
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
            if(plain.charAt(i)>255) {
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
            if(cipher.charAt(i)>255) {
                skip++;
                plain[i] = cipher.charAt(i);
            }
            else {
                plain[i] = (char) (((int) cipher.charAt(i) - (int) key.charAt((i-skip)%key.length()) + 256) % 256);
            }
        }
        return String.valueOf(plain);
    }
    
    static String removeDuplicatedChar(String str) {
        String unique = "";
        for(int i=0; i<str.length(); i++) {
            if(unique.indexOf(str.charAt(i))==-1)
                unique = unique.concat(str.substring(i,i+1));
        }
        return unique;
    }

    static String encryptPlayfair(String plain, String key) {
        String bigram = "";
        char[][] matrix;
        int candidate = 65;
        int i1=0, i2=0, j1=0, j2=0;
        String cipher = "";
        
        // Generating bigram
        plain = plain.toUpperCase();
        plain = plain.replace('J', 'I');
        for(int i=0; i<plain.length(); i++) {
            if(plain.charAt(i)!=' ') {
                bigram = bigram.concat(plain.substring(i, i+1));
            }
            if(i+1<plain.length()) {
                if(bigram.charAt(bigram.length()-1)==plain.charAt(i+1)&&bigram.length()%3==1) {
                    bigram = bigram.concat("Z");
                }
            }
            if((bigram.length()+1)%3==0)
                bigram = bigram.concat(" ");
        }
        if((bigram.length())%3==1)
                bigram = bigram.concat("Z");
        
        // Generating matrix key
        matrix = new char[5][5];
        key = key.replaceAll("[^a-zA-Z]", "");      // remove non-alphabetic char
        key = key.toUpperCase();                    // make key uppercase
        key = key.replaceAll(""+'J', "");           // remove 'J'
        key = removeDuplicatedChar(key);            // remove repeated char
        System.out.println("Matrix key:");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(i*5+j<key.length()&&key.charAt(i*5+j)!='J') {
                    matrix[i][j] = key.charAt(i*5+j);
                }
                else {
                    while(key.indexOf(candidate)!=-1||candidate=='J') {
                        candidate++;
                    }
                    matrix[i][j] = (char) candidate;
                    candidate++;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        // Encrypt process -> only alphabetic char would be encrypted
        for(int k=0; k<bigram.length(); k+=3) {
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[i].length; j++) {
                    if(matrix[i][j]==bigram.charAt(k)) {
                        i1=i;
                        j1=j;
                    }
                    if(matrix[i][j]==bigram.charAt(k+1)) {
                        i2=i;
                        j2=j;
                    }
                }
            }
            if(i1==i2) {
                cipher = cipher.concat(""+matrix[i1][(j1+1)%5]);
                cipher = cipher.concat(""+matrix[i2][(j2+1)%5]);
            }
            else if(j1==j2) {
                cipher = cipher.concat(""+matrix[(i1+1)%5][j1]);
                cipher = cipher.concat(""+matrix[(i2+1)%5][j2]);
            }
            else if(i1!=i2&&j1!=j2) {
                cipher = cipher.concat(""+matrix[i1][j2]);
                cipher = cipher.concat(""+matrix[i2][j1]);
            }
        }
        return cipher;
    }

    static String decryptPlayfair(String encrypted, String key) {
        String bigram = "";
        char[][] matrix;
        int candidate = 65;
        int i1=0, i2=0, j1=0, j2=0;
        String plain = "";
        
        // Generating bigram
        encrypted = encrypted.toUpperCase();
        for(int i=0; i<encrypted.length(); i++) {
            if(encrypted.charAt(i)!=' ') {
                bigram = bigram.concat(encrypted.substring(i, i+1));
            }
//            if(i+1<encrypted.length()) {
//                if(bigram.charAt(bigram.length()-1)==encrypted.charAt(i+1)&&bigram.length()%3==1) {
//                    bigram = bigram.concat("Z");
//                }
//            }
            if((bigram.length()+1)%3==0)
                bigram = bigram.concat(" ");
        }
//        if((bigram.length())%3==1)
//                bigram = bigram.concat("Z");
        
        // Generating matrix key
        matrix = new char[5][5];
        key = key.replaceAll("[^a-zA-Z]", "");      // remove non-alphabetic char
        key = key.toUpperCase();                    // make key uppercase
        key = key.replaceAll(""+'J', "");           // remove 'J'
        key = removeDuplicatedChar(key);            // remove repeated char
        System.out.println("Matrix key:");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(i*5+j<key.length()&&key.charAt(i*5+j)!='J') {
                    matrix[i][j] = key.charAt(i*5+j);
                }
                else {
                    while(key.indexOf(candidate)!=-1||candidate=='J') {
                        candidate++;
                    }
                    matrix[i][j] = (char) candidate;
                    candidate++;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        // Encrypt process -> only alphabetic char would be encrypted
        for(int k=0; k<bigram.length(); k+=3) {
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[i].length; j++) {
                    if(matrix[i][j]==bigram.charAt(k)) {
                        i1=i;
                        j1=j;
                    }
                    if(matrix[i][j]==bigram.charAt(k+1)) {
                        i2=i;
                        j2=j;
                    }
                }
            }
            if(i1==i2) {
                plain = plain.concat(""+matrix[i1][(j1-1+5)%5]);
                plain = plain.concat(""+matrix[i2][(j2-1+5)%5]);
            }
            else if(j1==j2) {
                plain = plain.concat(""+matrix[(i1-1+5)%5][j1]);
                plain = plain.concat(""+matrix[(i2-1+5)%5][j2]);
            }
            else if(i1!=i2&&j1!=j2) {
                plain = plain.concat(""+matrix[i1][j2]);
                plain = plain.concat(""+matrix[i2][j1]);
            }
        }
        return plain;
    }
    
}
