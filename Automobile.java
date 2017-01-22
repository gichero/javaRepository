/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Automobile
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


 // This class Automobile will be instantiated in the AutomobileTester main method
 
public class Automobile {
	//create instant variables of String type
	private String vehicleIdNo;
	private String make; 
	private String model;
	private String color;
	
	// Create a constructor  
	public Automobile(String vehicleIdNo,String make,String model,String color){
		this.vehicleIdNo = vehicleIdNo;
		this.make = make;
		this.model = model; 
		this.color = color; 
	}
	// create get and set methods
	public String getVehicleIdNo() {
		return vehicleIdNo;
	}

	public void setVehicleIdNo(String vehicleIdNo) {
		this.vehicleIdNo = vehicleIdNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	// create a method that will return a String value 
	public String getData(){
		return  "\n" + "Vehicle Id Number: " + vehicleIdNo + "\n" + "Make: " + make + " \n" + "Model: " + model +  "\n"  + "Color: " + color;
	}

}
