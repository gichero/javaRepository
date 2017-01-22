/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Unit 02 Program 2
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


public class Unit02Prog2{

  public static void main (String [] args) {

  java.util.Scanner input = new java.util.Scanner (System.in);

   //prompt user to enter no of students
System.out.print(
      "Enter the number of students: ");
    double numOfStudents = input.nextDouble();
    double highest = 0.0;
	String highest_name = "";
  //prompt user to enter student names
  //loop body
    for (int i = 0; i < numOfStudents; i++) {
      System.out.print(
        "Enter a student name: ");
      String student = input.next();
//prompt user to enter students scores
      System.out.print(
        "Enter a student score: ");
      double score = input.nextDouble();

      if (score > highest) {
        highest_name = student;
        highest = score;
      }
    }

    System.out.println("Top student " +
      highest_name + "'s score is " + highest);

}
}

