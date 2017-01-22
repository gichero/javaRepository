/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Unit 03 Program 2
 * Due: 6/30/2015
 * @author Amos Gichero
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

import java.util.Scanner;

public class Unit03Prog2 {
public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

 // Create arrays & enter variables  

 int arrayLength = 10;
 int[] numbers = new int[arrayLength];
 int[] distinctArray = new int[arrayLength];
 int count = 0;

 //Create loop and prompt user to enter integer

 for (int i = 0; i < numbers.length; i++) {
 System.out.print("Enter an integer: ");
 numbers[i] = input.nextInt();
  
 }
 // loop through values and create distinct values

  for (int i = 0; i < numbers.length; i++) {
  int temp2 = numbers[i];
  int temp = numbers[i + 1];
  
  if (temp2 == temp) {
   count++;
   distinctArray[i] = temp;
   System.out.print("The number of distinct values are: " + distinctArray[i]);
  }
 } 

 // Print out results

} // end main
} // end class
