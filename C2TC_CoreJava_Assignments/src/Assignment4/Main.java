package Assignment4;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Ticket booking input
    System.out.println("Enter booking details (stageEvent,customer,noOfSeats):");
    String bookingInput = sc.nextLine();
    String[] details = bookingInput.split(",");
    TicketBooking ticket = new TicketBooking(details[0], details[1], Integer.parseInt(details[2]));

    // Payment choice
    System.out.println("Enter payment mode (1. Cash | 2. Wallet | 3. Credit card):");
    int choice = Integer.parseInt(sc.nextLine());

    switch (choice) {
        case 1:
        	System.out.println("Enter amount:");
            double cashAmount = Double.parseDouble(sc.nextLine());
            ticket.displayDetails();
            ticket.makePayment(cashAmount);
            break;

        case 2:
            System.out.println("Enter amount:");
            double walletAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Enter wallet number:");
            String walletNumber = sc.nextLine();
            ticket.displayDetails();
            ticket.makePayment(walletAmount, walletNumber);
            break;

        case 3:
            System.out.println("Enter card holder name:");
            String holderName = sc.nextLine();
            System.out.println("Enter amount:");
            double creditAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Enter credit card type:");
            String creditCardType = sc.nextLine();
            System.out.println("Enter CCV number:");
            String ccv = sc.nextLine();
            ticket.displayDetails();
            ticket.makePayment(holderName, creditAmount, creditCardType, ccv);
            break;

        default:
            System.out.println("Invalid choice");
    }

    sc.close();
}

}
