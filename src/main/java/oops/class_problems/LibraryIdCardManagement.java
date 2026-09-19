package oops.class_problems;

import java.util.Scanner;

class IdCard {

    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class LibraryIdCardManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IdCard ravi = new IdCard("Ravi", 0);

        IdCard duplicate = ravi;

        duplicate.booksIssued = 3;

        IdCard separate = new IdCard("Ravi", 3);

        System.out.println(
            "Ravi's booksIssued (via first variable): "
            + ravi.booksIssued
        );

        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        System.out.println("separate == ravi: " + (separate == ravi));

        scanner.close();
    }
}
