package rvt;
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 no vingrinājuma
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 no vingrinājuma
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 no vingrinājuma
        int counter = 1;
        while (counter <= size) {
            printSpaces(size - counter);
            printStars(counter);
            counter++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 no vingrinājuma
        int counter = 1;
        while (counter <= height) {
            printSpaces(height - counter);
            printStars(2 * counter - 1);
            counter++;
        }

        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {


        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}