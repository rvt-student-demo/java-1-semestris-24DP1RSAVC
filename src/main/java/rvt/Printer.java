package rvt;

public class Printer {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int number : array) { // Iterē cauri masīva elementiem
            for (int i = 0; i < number; i++) { // Izdrukā 'number' zvaigznītes
                System.out.print("*");
            }
            System.out.println(); // Pāriet uz jaunu rindu pēc katra elementa
        }
    }
}