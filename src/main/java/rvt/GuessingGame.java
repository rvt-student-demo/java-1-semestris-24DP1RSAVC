package rvt;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(10) + 1; // ģenerē 1..10
        Scanner scanner = new Scanner(System.in);

        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos");
        System.out.println("Ievadi minējumu:");

        boolean won = false;
        for (int attempt = 1; attempt <= 3; attempt++) {
            int guess = Integer.valueOf(scanner.nextLine());

            if (guess == result) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarējis spēli.");
                won = true;
                break;
            } else {
                System.out.println("nepareizi");
                if (attempt == 3) {
                    System.out.println("Pareizais skaitlis bija " + result + ".");
                    System.out.println("Tu esi zaudējis spēli.");
                }
            }
        }
    }
}

