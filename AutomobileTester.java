/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Automobile Tester
 * Due: 07/07/2015
 * @author Amos Gichero
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

import java.util.*;

public class AutomobileTester {
	
	public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
	
	// Prompt user to enter the vehicle identification Number
	System.out.print("Enter the Vehicle Identification Number (VIN): ");
	String vehicleIdNo = input.next();
	
	//Prompt user to enter the make of the Vehicle
	System.out.print("Enter the make of the Vehicle: ");
	String make = input.next();
	
	//Prompt user to enter the model of the vehicle
	System.out.print("Enter the model of the Vehicle: ");
	String model = input.next();
	
	//Prompt user to enter the color of the vehicle
	System.out.print("Enter the color of the Vehicle: ");
	String color = input.next();
	
	// Create an object
			Automobile vehicleDetails = new Automobile(vehicleIdNo,make,model,color);
			
			System.out.println("Vehicle Details: " + vehicleDetails.getData());
			input.close();
				
	}
	
}
