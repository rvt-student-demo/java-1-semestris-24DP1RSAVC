package rvt;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        if(number % 2 == 0){
            System.out.println("Number " + number + " is even");
        }else{
            System.out.println("Number " + number + " is odd");
        }

    }
}
