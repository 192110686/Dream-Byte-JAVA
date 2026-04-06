package basic_java;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do { 
            System.out.println("Enter password: ");
             pass =sc.nextLine();

        } while (pass.equals("java")); 
        System.out.println("Access Granted");
    }
}