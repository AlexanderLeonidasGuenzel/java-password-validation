package org.example;

import java.util.Scanner;

public class Main {

    public static String password;
    public static void main(String[] args) {
        setPassword();
        showPassword();
        System.out.println("Has length 8: "+ checkPasswordLength(password));
        System.out.println("Has numbers: " + containNumbers(password));

        //System.out.println("Login erfolgreich!");

    }

    public static void setPassword(){

        /*System.out.println("Set password: ");
        Scanner sc = new Scanner(System.in);
        password = sc.next();
        sc.close();*/
        password = "5A8nG2f9v";
    }
    public static void showPassword(){
        System.out.println("Password: " + password);
    }

    public static boolean checkPasswordLength(String pw){
        return pw.length()==8;
    }
    public static boolean containNumbers(String pw){

        return pw.matches("[0-9]]");
    }
}