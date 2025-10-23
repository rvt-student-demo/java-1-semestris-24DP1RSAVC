package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        // Izsaucam katru uzdevuma metodi
        testRemoveLast();

       
    }

    public static void onlyTheseNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nolasām skaitļus, līdz tiek ievadīts -1
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        // Pieprasām sākuma un beigu indeksus
        System.out.println("From where?");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("To where?");
        int end = Integer.parseInt(scanner.nextLine());

        // Izdrukājam skaitļus norādītajā diapazonā (ieskaitot galapunktus)
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void listSize() {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nolasām virknes, līdz tiek ievadīta tukša virkne
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        // Izdrukājam saraksta izmēru
        System.out.println("In total: " + strings.size());
    }

    public static void onTheList() {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nolasām virknes, līdz tiek ievadīta tukša virkne
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        // Pieprasām meklējamo virkni
        System.out.println("Search for");
        String search = scanner.nextLine();

        // Pārbaudām, vai virkne ir sarakstā
        if (strings.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        // Noņemam pēdējo elementu, ja saraksts nav tukšs
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }

    public static void testRemoveLast() {
        // Testējam removeLast metodi
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println(strings);
        removeLast(strings);
        removeLast(strings);
        System.out.println(strings);
    }
}