package edu.isu.cs.student.project;

import java.util.Random;

public class PasswordGenerator {

    final static String NUMBERS = "123456789";
    final static String UPPERCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String CHAR = "abcdefghijklmnopqrstuvwxyz";
    final static String pass = NUMBERS + UPPERCHAR + CHAR;


    public static StringBuilder generate(int length){
        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i<length; i++) {
           password.append(pass.charAt(rand.nextInt(pass.length())));
        }
    return password;
    }


}
