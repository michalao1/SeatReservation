package driver;

import java.util.Scanner;

import model.SeatReservation;

/*
 * Michala Ouverson - mmouverson1
 * CIS171 <21708> 
 * Apr 15, 2024
 */

public class ReservationDriver {

	 // Main method to use SeatReservation methods
	   public static void main (String [] args) {
	      Scanner scnr = new Scanner(System.in);
	      String usrInput = "";
	      int seatNum;
	      SeatReservation ezReservations = new SeatReservation();

	      // Add 5 seat objects
	      ezReservations.addSeats(5);

	      // Make all seats empty
	      ezReservations.makeSeatsEmpty();

	      while (!usrInput.equals("q")) {
	         System.out.println();
	         System.out.println("p(print), r(reserve), d(delete), q(quit)");
	         System.out.print("Enter command (p/r/d/q): ");
	         usrInput = scnr.next() ;

	         // Print seats
	         if (usrInput.equals("p")) { 
	            ezReservations.printSeats();
	         }
	         
	         // Reserve a seat
	         else if (usrInput.equals("r")) {	        	 
	        	 ezReservations.makeSeatReservation(scnr);
	               System.out.println("Completed.");
	            }
	         //delete a seat
	         else if (usrInput.equals("d")) {
	        	 System.out.print("Enter the seat number to be deleted: ");
	        	 seatNum = scnr.nextInt();
	        	 ezReservations.deleteSeat(seatNum);
	        	 System.out.println("Deleted");
	        	 
	         }

	         else if (usrInput.equals("q")) { // Quit
	            System.out.println("Quitting.");
	         }
	         
	         else {
	            System.out.println("Invalid command.");
	         }
	      }
	      scnr.close();
	   }
}


 
