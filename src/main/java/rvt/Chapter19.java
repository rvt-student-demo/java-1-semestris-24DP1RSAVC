package rvt;

public class Chapter19 {
    public static void main(String[] args) {
        ex(1);
    }
    public static void ex1() {

    }
    public static void ex2() {

    }
}
package rvt;

import java.util.Scanner;

public class Chapter19 {

    public static void main(String[] args) {
        // te var palaist jebkuru no uzdevumiem
        // piem.: ex1(); vai ex2(); utt.
        ex7();
    }

    // Exercise 1 — Run of Integers
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter End:");
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        scanner.close();
    }

    // Exercise 2 — Sum of Sequential Integers
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = Integer.parseInt(scanner.nextLine());

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);

        scanner.close();
    }

    // Exercise 3 — Sum of Sequential Squares
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = Integer.parseInt(scanner.nextLine());

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i * i;
        }

        int formulaSum = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);

        scanner.close();
    }

    // Exercise 4 — Sum of a Range of Sequential Integers
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low:");
        int low = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter high:");
        int high = Integer.parseInt(scanner.nextLine());

        if (low > high) {
            int t = low;
            low = high;
            high = t;
        }

        int sum1ToHigh = high * (high + 1) / 2;
        int sum1ToLowMinus1 = (low - 1) * low / 2;
        int rangeSum = sum1ToHigh - sum1ToLowMinus1;

        System.out.println("Sum = " + rangeSum);

        scanner.close();
    }

    // Exercise 5 — Repeatedly Echo a Word
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        int times = word.length();
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }

        scanner.close();
    }

    // Exercise 6 — Words Separated by Dots
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String first = scanner.nextLine();

        System.out.println("Enter second word:");
        String second = scanner.nextLine();

        int totalLength = 30;
        int dots = totalLength - (first.length() + second.length());

        if (dots < 1) {
            System.out.println(first + " " + second);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(first);
            for (int i = 0; i < dots; i++) {
                sb.append('.');
            }
            sb.append(second);
            System.out.println(sb.toString());
        }

        scanner.close();
    }

    // Exercise 7 — One Letter per Line
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        scanner.close();
    }
}
