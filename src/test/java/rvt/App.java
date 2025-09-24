package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int age = Integer.valueOf(scanner.nextLine());
        // if (age >= 18) {
        //     System.out.println("Tu esi pilngadīgs");
        // } else {
        //     System.out.println("Tu nevari lietot programmu!");
        // } 

        System.out.println("Password?");
        String password = scanner.nextLine();

        if (password.equals("Caput Draconis")) {
        System.out.println("Welcome!"); 
        }else{
            System.out.println("Off with you");
        }
    }
}
