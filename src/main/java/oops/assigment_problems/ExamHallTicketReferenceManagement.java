package oops.assigment_problems;

import java.util.Scanner;

class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class ExamHallTicketReferenceManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HallTicket priya = new HallTicket("Priya", 0);

        HallTicket copy = priya;

        copy.seatNumber = 45;

        HallTicket separate = new HallTicket("Priya", 45);

        System.out.println(
            "Priya's seatNumber (via first variable): "
            + priya.seatNumber
        );

        System.out.println("copy == priya: " + (copy == priya));

        System.out.println("separate == priya: " + (separate == priya));

        scanner.close();
    }
}