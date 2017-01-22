
/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Unit06_Prog2
 * Due: 07/21/2015
 * @author Amos Gichero
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class Unit06_Prog2 {

    public static void main(String[] args) {
       
        Square Square = new Square();
        if (Square instanceof Colorable) {
                Colorable colorable = (Colorable) Square;
                colorable.howToColor();
                }
         

    }
}
