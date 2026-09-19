package oops.assigment_problems;

import java.util.Scanner;

class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(
            title + " by " + author + " - "
            + copiesAvailable + " copies available"
        );
    }
}

public class LibraryInventoryManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookInventory[] books = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        for (BookInventory book : books) {
            book.printEntry();
        }

        scanner.close();
    }
}