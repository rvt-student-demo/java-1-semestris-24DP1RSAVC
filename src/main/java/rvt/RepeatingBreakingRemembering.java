package rvt;

import java.util.Scanner;

public class RepeatingBreakingRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers");
        while(true){
             int number = Integer.valueOf(scanner.nextLine());

            if(number == -1){
                break;

                sum += number;
                count++;

                if(number % 2 == 0){
                    even++;
                }else{
                    odd++;
                }

                System.out.println("Thx! Bye!");
                System.out.println("Sum" + sum);
                System.out.println("Numbers" + count);
                
                if(count > 0){
                    
                }

            }
        }
    }
}
