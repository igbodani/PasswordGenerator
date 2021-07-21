package edu.isu.cs.student.project;

import java.util.Random;

public class PasswordGenerator {

    final static String NUMBERS = "123456789";
    final static String SYMBOLS = "!*%@?&$#?";
    final static String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    final static String ALLCHARS = SYMBOLS + NUMBERS + LOWERCASE + UPPERCASE;
    final static String NOSYMBOL = NUMBERS + UPPERCASE + LOWERCASE;
    final static String NOUPPERCASE = NUMBERS + LOWERCASE + SYMBOLS;
    final static String NOLOWERCASE = NUMBERS + UPPERCASE + SYMBOLS;
    final static String NONUMBERS = LOWERCASE + UPPERCASE + SYMBOLS;
    final static String LETTERS = LOWERCASE + UPPERCASE;
    final static String LOWERNUMBERS = LOWERCASE + NUMBERS;
    final static String UPPERNUMBERS = UPPERCASE + NUMBERS;
    final static String LOWERSYMBOLS = LOWERCASE + SYMBOLS;
    final static String UPPERSYMBOLS = UPPERCASE + SYMBOLS;
    final static String NUMBERSYMBOLS = NUMBERS + SYMBOLS;

    public static String generateAll(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
            password.append(ALLCHARS.charAt(rand.nextInt(ALLCHARS.length())));
        }
        return password.toString();
    }

    public static String noSpecialChar(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
       StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
           password.append(NOSYMBOL.charAt(rand.nextInt(NOSYMBOL.length())));
        }
    return password.toString();
    }

    public static String numbersOnly(int length){
        if(length < 1 || length >9){
            return "Insufficient characters or To long";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        for(int i = 0; i<length; i++) {
            password.append(NUMBERS.charAt(rand.nextInt(NUMBERS.length())));
        }
        return password.toString();
    }

    public static String noNumbers(int length){
        if(length < 8 || length >24){
            return "Insufficient characters or To long";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        for(int i = 0; i<length; i++) {
            password.append(NONUMBERS.charAt(rand.nextInt(NONUMBERS.length())));
        }
        return password.toString();
    }

    public static String lowerNumbers(int length){
        if(length < 8 || length >24){
            return "Insufficient characters or To long";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        for(int i = 0; i<length; i++) {
            password.append(LOWERNUMBERS.charAt(rand.nextInt(LOWERNUMBERS.length())));
        }
        return password.toString();
    }

    public static String upperNumbers(int length){
        if(length < 8 || length >24){
            return "Insufficient characters or To long";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        for(int i = 0; i<length; i++) {
            password.append(UPPERNUMBERS.charAt(rand.nextInt(UPPERNUMBERS.length())));
        }
        return password.toString();
    }

    public static String specialCharOnly(int length){
        if(length < 1 || length >9){
            return "Insufficient characters or To long";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        for(int i = 0; i<length; i++) {
            password.append(SYMBOLS.charAt(rand.nextInt(SYMBOLS.length())));
        }
        return password.toString();
    }

    public static String lettersOnly(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        for(int i = 0; i<length; i++) {
            password.append(LETTERS.charAt(rand.nextInt(LETTERS.length())));
        }
        return password.toString();
    }

    public static String noUpperCase(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();


        for(int i = 0; i<length; i++) {
            password.append(NOUPPERCASE.charAt(rand.nextInt(NOUPPERCASE.length())));
        }
        return password.toString();
    }

    public static String noLowerCase(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
            password.append(NOLOWERCASE.charAt(rand.nextInt(NOLOWERCASE.length())));
        }
        return password.toString();
    }


    static String upperCase(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
            password.append(UPPERCASE.charAt(rand.nextInt(UPPERCASE.length())));
        }
        return password.toString();
    }

    public static String lowerCase(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
            password.append(LOWERCASE.charAt(rand.nextInt(LOWERCASE.length())));
        }
        return password.toString();
    }
    public static String numberSymbols(int length){
        if(length < 8 || length >18){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
            password.append(NUMBERSYMBOLS.charAt(rand.nextInt(NUMBERSYMBOLS.length())));
        }
        return password.toString();
    }
    public static String lowerSymbols(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
            password.append(LOWERSYMBOLS.charAt(rand.nextInt(LOWERSYMBOLS.length())));
        }
        return password.toString();
    }

    public static String upperSymbols(int length){
        if(length < 8 || length >24){
            return "Insufficient characters";
        }
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i<length; i++) {
            password.append(UPPERSYMBOLS.charAt(rand.nextInt(UPPERSYMBOLS.length())));
        }
        return password.toString();
    }


}
