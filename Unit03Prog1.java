/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Unit 03 Program 1
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

public class Unit03Prog1 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// prompt user to enter characters

        System.out.println("please enter two characters:");

        char c1 = (char)input.next().charAt(0);
        char c2 = (char)input.next().charAt(0);
        int num = 10;
        
        System.out.println(" Printing all characters between " + c1 + " and " + c2 );
        
        printChar(c1, c2, num);        
        
    }

// pass the two characters to a method 

    public static void printChar(char c1, char c2, int num) {
       int count = 0;

// loop to determine that c1 is not greater that c2       
       while (c1 <= c2) {
       System.out.print(c1);
       count++; 
       
       if (count == num) {
       count = 0;
       System.out.println (" ");
            
         
       }
       c1++; // increment of character by 1, prevent infinite loop
    }

    
}

}