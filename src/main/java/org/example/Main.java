package org.example;

import java.util.Scanner;

public class Main {
    public static String password;

    public static void main(String[] args) {

        boolean passwordCheck = false;

        do{
            setPassword();
            passwordCheck = checkAll(password);
            if(passwordCheck == false){
                System.out.println("Fail! Bad password. Try again!");
            }
        }while(passwordCheck == false);
        System.out.println("Success! Password set.");
    }

    public static void setPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("A good password contains at least one of [a-z][A-Z][0-9]. Length of 8 characters.");
        System.out.print("Input password: ");
        password = sc.next();
    }

    public static void setPasswordFix(String pw){
        System.out.println("--------------------------------------");
        System.out.println("A good password contains at least one of [a-z][A-Z][0-9]. Length of 8 characters.");
        System.out.print("Input password: ");
        password = pw;
    }

    public static void printCheckAll(String password){
        System.out.println("Has length 8: "  + checkPasswordLength(password));
        System.out.println("Has numbers: "   + containNumbers(password));
        System.out.println("Has Uppercase: " + containUpperCase(password));
        System.out.println("Has Lowercase: " + containLowerCase(password));
    }

    public static boolean checkAll(String password){

        boolean a,b,c,d;

        a = checkPasswordLength(password);
        b = containNumbers(password);
        c = containUpperCase(password);
        d = containLowerCase(password);

        return a && b && c && d;
    }



    public static void showPassword(){
        System.out.println("Password: " + password);
    }

    public static boolean checkPasswordLength(String pw){
        return pw.length()==8;
    }
    public static boolean containNumbers(String pw){

        boolean containsNumbers = false;
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isDigit(pw.charAt(i))) {
                containsNumbers = true;
                break;
            }
        }
        return containsNumbers;
    }

    public static boolean containUpperCase(String pw){

        boolean containsUppercase = false;
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isUpperCase(pw.charAt(i))) {
                containsUppercase = true;
                break;
            }
        }
        return containsUppercase;
    }

    public static boolean containLowerCase(String pw){

        boolean containsLowercase = false;
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isLowerCase(pw.charAt(i))) {
                containsLowercase = true;
                break;
            }
        }
        return containsLowercase;
    }
}