package rvt;

import java.util.Scanner;

public class delikateses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.println("Ekspress piegāde (0 == nē, 1 == jā): ");
        int ekspress = Integer.valueOf(scanner.nextLine());

        double piegade = 0.00;
        if (cena <= 10.00) {
            piegade = 2.00;
        }
        if (ekspress == 1) {
            piegade += 3.0;
        }
        double kopa = cena + piegade;

        System.out.println("Rēķins:");
        System.out.println(prece + " " + cena);
        System.out.println("Piegāde " + piegade);
        System.out.println("Kopā " + kopa);

    }
}
