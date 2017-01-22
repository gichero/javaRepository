/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution Unit 05 Program 1
 * Due: 07/14/2015
 * @author Amos Gichero
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */


public class Unit05Prog1 {

public static void main(String[] args) {

       if(args.length == 0) {
       
       System.out.println ("A string argument is required!");
       
       }
       
       String s = args [0];
       int lower = 0;
       
       // loop through the string to count the lowercase letters
       for(int i = 0; i < s.length(); i++) {
       if (Character.isLowerCase(s.charAt(i))) 
       if (Character.isLetter(s.charAt(i)))
       lower++; }
       // display the result
       System.out.println ("The number of lowercase characters is: " + lower + "\n");
       
       } //main
       
} //class
  
  
       

        