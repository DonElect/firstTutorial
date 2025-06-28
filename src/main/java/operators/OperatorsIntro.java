package operators;

import java.util.Scanner;

public class OperatorsIntro {
    /*
    * Examples of operators:
    *
    * +,-,*,>>,<<,/
    * */

    /*
    * Ticket booking Application
    *
    * Provide name and amount of ticket
    * */

    public static void main(String[] args) {
        int initialTicketQuantity = 50;
        String firstName = null;
        String lastName = null;
        int ticketsRequested = 0;

        System.out.println("Welcome to TicketLinner.");
        System.out.println("Tickets available: " + initialTicketQuantity);

        Scanner scan = new Scanner(System.in);

        System.out.println("First name: ");
        firstName = scan.nextLine();

        System.out.println("Last name: ");
        lastName = scan.nextLine();

        System.out.println("Amount of tickets needed: ");
        ticketsRequested = scan.nextInt();

        /*
        * Percentage = (actualAmount/totalAmount) * 100
        * Percentage of tickets remaining = ((initialTicketQuantity - ticketsRequested)/initialTicketQuantity) * 100
        * */

       int availableTickets = initialTicketQuantity - ticketsRequested;

       double percentageAvailableTickets = ((double) availableTickets / initialTicketQuantity) * 100.0;

        System.out.println("Thank you for using TicketLinner "+firstName + " " + lastName+". You booked for "+ticketsRequested+" tickets.");

        System.out.println("Available tickets: " + availableTickets);
        System.out.println("Percentage available tickets: " + percentageAvailableTickets+"%");
    }
}
