/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Unit 01 Program 2
 * Due: 6/14/2015
 * @author Amos Gichero
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */
public class Unit01_Prog2 {

public static void main (String[]args) {

java.util.Scanner input = new java.util.Scanner(System.in);

// Enter an integer in feet
System.out.print ("Enter an integer in feet:");

 int feet = input.nextInt();
 
// Convert it to meters
 double meter = feet * 0.305;

    // Display the result
    System.out.println("The feet are " +
      meter + " in Meters");
}
}
 