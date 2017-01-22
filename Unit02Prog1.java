/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Unit 02 Program 1
 * Due: 6/22/2015
 * @author Amos Gichero
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class Unit02Prog1 {

   public static void main (String[]args) {

// Create a scanner
   java.util.Scanner input = new java.util.Scanner(System.in);
// Receive an input

System.out.print("Enter an integer: ");
int number = input.nextInt();

if (number % 5 == 0 && number % 6 == 0)
System.out.println (number + " is divisible by 5 and 6.");

if (number % 5 == 0 || number % 6 == 0)
System.out.println (number + " is divisible by 5 or 6.");

if (number % 5 == 0 ^ number % 6 == 0)
System.out.println (number + " is divisible by 5 or 6, but not both.");

// else
// System.out.println (number + " is indivisible by 5 and, or 6.");

   }
}
