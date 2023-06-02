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
        System.out.println(containNumbers(password));
    }

    public static void setPassword(){

        /*System.out.println("Set password: ");
        Scanner sc = new Scanner(System.in);
        password = sc.next();
        sc.close();*/
        password = "AGfv";
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
}