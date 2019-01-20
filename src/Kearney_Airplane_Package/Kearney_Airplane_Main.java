//Author Name: David Kearney
//Date: 1/13/2019
//Program Name: Kearney_Airplane
//Purpose: Simulation using "call" button, call attendent

package Kearney_Airplane_Package;

import java.util.*;

public class Kearney_Airplane_Main {
	
	// Six seats total, 1 for the attendant and 5 for passengers
	public static int SIZE = 6;

	public static void main(String[] args) {
		// Creates each seat for the size of the aircraft
		Seat[] seats = new Seat[SIZE];
		String output = "";
		
		// Initialize each seat
		for (int i = 0; i < SIZE; i++) {
			Seat newSeat = new Seat(i);
			seats[i] = newSeat;
		}
		
		// Main loop of the program
		
		// Passengers
		// Entering 1 - 5 will activate the call button for that seat
		// Passengers can only activate their call button
		
		// Attendant
		// Entering 0 will set each seat's call button status to "off"
		// Only the attendant can deactivate the call buttons
		
		// Entering "exit" will close the program
		while(output != "exit") {
			System.out.println("Enter 1 - 5 to call an attendant to that seat number.");
			System.out.println("Enter 'exit' to exit the program");
			Scanner keyboard = new Scanner(System.in);
			output = keyboard.nextLine();
			switch(output) {
				case "0":
					for (int i = 0; i < SIZE; i++) {
						seats[i].deactivate_call_btn();
					}
					break;
				case "1":
					seats[1].activate_call_btn();
					break;
				case "2":
					seats[2].activate_call_btn();
					break;
				case "3":
					seats[3].activate_call_btn();
					break;
				case "4":
					seats[4].activate_call_btn();
					break;
				case "5":
					seats[5].activate_call_btn();
					break;
				case "exit":
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Entry...");
					break;
			}

			// Prints out the status of each seat (1 - 5) to the screen
			System.out.println("------------------------------");
			for (int i = 1; i < SIZE; i++) {
				System.out.println("Seat #" + i + " call button is " + seats[i].getCallStatus() + ".");
			}
			System.out.println("------------------------------\n\n");
		}//End of While Loop
	}// End of Main
}// End of Program
