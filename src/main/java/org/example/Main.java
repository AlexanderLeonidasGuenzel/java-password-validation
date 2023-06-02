package org.example;

import java.util.Scanner;

public class Main {

    public static String password;

    public static void main(String[] args) {
        setPassword("agfv5");
        checkAll(password);
        setPassword("Agfv5");
        checkAll(password);

        //System.out.println("Login erfolgreich!");

    }

    public static void setPassword(String pw){

        /*System.out.println("Set password: ");
        Scanner sc = new Scanner(System.in);
        password = sc.next();
        sc.close();*/
        password = pw;
        System.out.println("--------------------------------------");
        showPassword();


    }

    public static void checkAll(String password){
        System.out.println("Has length 8: "+ checkPasswordLength(password));
        System.out.println("Has numbers: " + containNumbers(password));
        System.out.println("Has Uppercase: " + containUpperCase(password));
        System.out.println("Has Lowercase: " + containLowerCase(password));
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