package edu.isu.cs.student.project;

import java.util.Random;

public class PasswordGenerator {
   // private static Random rand;
    Random rand = new Random();
    int length;
    final static String NUMBERS = "123456789";
    final static String UPPERCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String CHAR = "abcdefghijklmnopqrstuvwxyz";
    final static String pass = NUMBERS+UPPERCHAR+CHAR;

    public static void main(String[] args) {
       // System.out.println(pass);
        Random ra = new Random();
        PasswordGenerator p = new PasswordGenerator();
        System.out.println(p.generate(8));

    }


    public StringBuilder generate(int length){
        StringBuilder password = new StringBuilder();
        for(int i = 0; i<length; i++) {
           password.append(pass.charAt(rand.nextInt(pass.length())));
        }
    return password;
    }


}
