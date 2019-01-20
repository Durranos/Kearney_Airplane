//Author Name: David Kearney
//Date: 1/13/2019
//Program Name: Kearney_Airplane
//Purpose: Simulation using "call" button, call attendent

package Kearney_Airplane_Package;

// The purpose of this class is for a button to be able to be switched between on and off
public class Button {
	
	private boolean btn_active;
	
	public Button() {
		this.btn_active = false;
	}
	
	// Activates the button
	public void setBtnActive() {
		this.btn_active = true;
	}
	
	// Deactivates the button
	public void setBtnInactive() {
		this.btn_active = false;
	}
}
