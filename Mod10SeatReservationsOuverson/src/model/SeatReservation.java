package model;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Michala Ouverson - mmouverson1
 * CIS171 <21708> 
 * Apr 15, 2024
 */

public class SeatReservation {
   // Arraylist for seat reservations
   private ArrayList<Seat> allSeats;
   static int numSeatsReserved = 0;
   
   public SeatReservation() {
       allSeats = new ArrayList<Seat>();
   }
   
   public void makeSeatsEmpty() {
      int i;
      for (i = 0; i < allSeats.size(); ++i) {
         allSeats.get(i).makeEmpty();
      }
   }

   public void printSeats() {
      int i;
      System.out.println("Total Seats Reserved: " + numSeatsReserved);
      for (i = 0; i < allSeats.size(); ++i) {
         System.out.print(i + ": ");
         allSeats.get(i).print();
      }
   }

   public void addSeats(int numSeats) {
      int i;
      for (i = 0; i < numSeats; ++i) {
         allSeats.add(new Seat());
      }
      
   }
   
   public Seat getSeat(int seatNum) {
      return allSeats.get(seatNum);
   }   
   
   public void setSeat(int seatNum, Seat newSeat) {
      allSeats.set(seatNum, newSeat); 
   }
 
   // add a method to delete a seat, You will accept 
  public void deleteSeat(int seatNum) {
	  allSeats.remove(seatNum);
	  numSeatsReserved -= 1;
  }
	
	// add a method to make a reservation.
	public void makeSeatReservation(Scanner scnr) {
		int seatNum;
		String firstName;
		String lastName;
		int amountPaid;
		Seat newSeat;
		
		System.out.print("Enter seat num: ");
        seatNum = scnr.nextInt();

        if ( !(getSeat(seatNum).isEmpty()) ) {
           System.out.println("Seat not empty.");
        }
        else {
           System.out.print("Enter first name: ");
           firstName = scnr.next();
           System.out.print("Enter last name: ");
           lastName = scnr.next();
           System.out.print("Enter amount paid: ");
           amountPaid = scnr.nextInt();

           // Create new Seat object and add to the reservations
           newSeat = new Seat();
           newSeat.reserve(firstName, lastName, amountPaid); 
           setSeat(seatNum, newSeat);
           numSeatsReserved += 1;
	}
	}
		
	
}
