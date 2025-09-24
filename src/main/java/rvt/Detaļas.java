package rvt;

import java.util.Scanner;

public class Detaļas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final int boltPrice = 5;   // 5 centi par skrūvi
        final int nutPrice = 3;    // 3 centi par uzgriezni
        final int washerPrice = 1; // 1 cents par paplāksni

        System.out.print("Skrūvju skaits: ");
        int skruves = Integer.valueOf(scanner.nextLine());

        System.out.print("Uzgriežņu skaits: ");
        int uzgriezni = Integer.valueOf(scanner.nextLine());

        System.out.print("Paplāksņu skaits: ");
        int paplaksni = Integer.valueOf(scanner.nextLine());

        int total = skruves * boltPrice + uzgriezni * nutPrice + paplaksni * washerPrice;

        boolean error = false;
        if (uzgriezni < skruves) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
            error = true;
        }
        if (paplaksni < 2 * skruves) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
            error = true;
        }
        if (!error) {
            System.out.println("Pasūtījums ir kārtībā.");
        }

        System.out.println("Kopējā cena: " + total);
    }
}

