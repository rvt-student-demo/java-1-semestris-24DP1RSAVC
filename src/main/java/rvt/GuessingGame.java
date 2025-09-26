package rvt;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(9) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos");
        System.out.println("Ievadi minējumu:");

        int num = 0;
        int number = Integer.valueOf(scanner.nextLine());
        while(number < 3)
        if(number == result){
            System.out.println("PAREIZI!");
            break;
        }else{
            System.out.println("NEPAREIZI!");
            num += 1;
            if(number == 3){

            }
        }
    }
}
