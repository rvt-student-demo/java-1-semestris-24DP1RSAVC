package rvt;
import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers= new int[5];
    numbers[0] = 1;
    numbers[1] = 3;
    numbers[2] = 5;
    numbers[3] = 7;
    numbers[4] = 9;
    System.out.println("Give two indices to swap ");
    int index = Integer.valueOf(reader.nextLine());
    int index1 = Integer.valueOf(reader.nextLine());
    int temp = numbers[index];
    numbers[index] = numbers[index1];
    numbers[index1] = temp;
    System.out.println(Arrays.toString(numbers));
    }
}
