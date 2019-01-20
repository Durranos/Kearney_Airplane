//Author Name: David Kearney
//Date: 1/13/2019
//Program Name: Kearney_Airplane
//Purpose: Simulation using "call" button, call attendent

package Kearney_Airplane_Package;

// This class's purpose is to track the status of the call button
// This can later be expanded to hold passenger information
public class Seat {

	private int seatNum;
	private String callStatus;
	private Button btn;
	
	public Seat(int num) {
		this.seatNum = num;
		this.callStatus = "Off";
		this.btn = new Button();
	}
	
	// Returns the seat number
	public int getSeatNum() {
		return this.seatNum;
	}
	
	// Activates the seat's call button
	public void activate_call_btn() {
		this.btn.setBtnActive();
		this.callStatus = "On";
	}
	
	// Deactivates the seat's call button
	public void deactivate_call_btn() {
		this.btn.setBtnInactive();
		this.callStatus = "Off";
	}
	
	// Returns the status of the seat's call button
	public String getCallStatus() {
		return this.callStatus;
	}
}
