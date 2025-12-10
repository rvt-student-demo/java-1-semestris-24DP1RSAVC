package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // 1. Lasām grāmatas, kamēr lietotājs neievada tukšu nosaukumu
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        // 2. Jautājam, ko drukāt
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();

        // 3. Izvadām atkarībā no atbildes
        for (Book book : books) {
            if (answer.equals("everything")) {
                System.out.println(book);
            } else if (answer.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}

// Klase Book
class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
