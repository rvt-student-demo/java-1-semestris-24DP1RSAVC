package rvt;

public class SumOfArray {
    public static void main(String[] args) {
        // Šeit var testēt metodi
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers)); // Jāizdrukā 15
    }

    public static int sumOfNumbersInArray(int[] array) {
        int summa = 0;
        for (int skaitlis : array) {
            summa += skaitlis;
        }
        return summa;
    }
}
