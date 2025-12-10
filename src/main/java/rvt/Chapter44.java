package rvt;

import java.util.Scanner;

public class Chapter44 {

    public static void main(String[] args) {
        // Atkomentē to uzdevumu, kuru gribi palaist:

        exercise1_NameEcho();
        exercise2_LinePerChar();
        exercise3_TitleApplier();
        exercise4_MicrowaveMenu();
        exercise5_DocumentationPrinter();
        exercise5_BetterDocumentationPrinter();
        exercise6_PasswordChecker();
        exercise7_WordTriangle();
    }

    public static void exercise1_NameEcho() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String fullName = sc.nextLine().trim();

        int spaceIndex = fullName.indexOf(" ");

        if (spaceIndex <= 0) {
            System.out.println(fullName);
            return;
        }

        String firstName = fullName.substring(0, spaceIndex);
        String lastName  = fullName.substring(spaceIndex + 1);

        System.out.println(firstName + " " + lastName.toUpperCase());
    }

    public static void exercise2_LinePerChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void exercise3_TitleApplier() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name: ");
            String line = sc.nextLine().trim();

            if (line.isEmpty()) break;

            String firstName = line.split(" ")[0];

            if (firstName.equals("Amy") || firstName.equals("Buffy") || firstName.equals("Cathy")) {
                System.out.println("Ms. " + line);
            } else if (firstName.equals("Elroy") || firstName.equals("Fred") || firstName.equals("Graham")) {
                System.out.println("Mr. " + line);
            } else {
                System.out.println(line);
            }
        }
    }

    public static void exercise4_MicrowaveMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cook time-> ");
        String input = sc.nextLine().trim();

        String seconds = "";
        String minutes = "0";

        if (input.length() <= 2) {
            seconds = input.isEmpty() ? "00" : String.format("%2s", input).replace(' ', '0');
        } else {
            seconds = input.substring(input.length() - 2);
            minutes = input.substring(0, input.length() - 2);
        }

        System.out.println("Your time->  " + minutes + ":" + seconds);
    }

    public static void exercise5_DocumentationPrinter() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.trim().startsWith("//")) {
                System.out.println(line);
            }
        }
    }

    public static void exercise5_BetterDocumentationPrinter() {
        Scanner sc = new Scanner(System.in);
        boolean inBlockComment = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String trimmed = line.trim();

            if (trimmed.startsWith("/*")) {
                inBlockComment = true;
            }

            if (inBlockComment || trimmed.startsWith("//")) {
                System.out.println(line);
            }

            if (trimmed.startsWith("*/") || trimmed.endsWith("*/")) {
                inBlockComment = false;
            }
        }
    }

    public static void exercise6_PasswordChecker() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your password:\n");
            String pwd = sc.nextLine();

            if (pwd.length() < 7) {
                System.out.println("That password is not acceptable.\n");
                continue;
            }

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for (int i = 0; i < pwd.length(); i++) {
                char c = pwd.charAt(i);
                if (Character.isUpperCase(c)) hasUpper = true;
                if (Character.isLowerCase(c)) hasLower = true;
                if (Character.isDigit(c))     hasDigit = true;
            }

            if (!hasUpper || !hasLower || !hasDigit) {
                System.out.println("That password is not acceptable.\n");
                continue;
            }

            System.out.println("Acceptable password.");
            break;
        }
    }

    public static void exercise7_WordTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word --> ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            // Izdrukā i tukšumus pirms
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Izdrukā atlikušo vārda daļu (no i līdz beigām)
            System.out.println(word.substring(i));
        }
    }
}