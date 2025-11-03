import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) break;
            all.addNumber(number);
            if (number % 2 == 0) even.addNumber(number);
            else odd.addNumber(number);
        }

        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
    // public class MainProgram {
    // public static void main(String[] args) {
    //     PaymentCard paulsCard = new PaymentCard(20);
    //     PaymentCard mattsCard = new PaymentCard(30);

    //     paulsCard.eatHeartily();
    //     mattsCard.eatAffordably();
    //     System.out.println("Paul: " + paulsCard);
    //     System.out.println("Matt: " + mattsCard);

    //     paulsCard.addMoney(20);
    //     mattsCard.eatHeartily();
    //     System.out.println("Paul: " + paulsCard);
    //     System.out.println("Matt: " + mattsCard);

    //     paulsCard.eatAffordably();
    //     paulsCard.eatAffordably();
    //     mattsCard.addMoney(50);
    //     System.out.println("Paul: " + paulsCard);
    //     System.out.println("Matt: " + mattsCard);
    // }
// }
}
