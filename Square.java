
/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Square class
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

public class Square extends GeometricObject implements Colorable {

      private double side;

      public Square() {

      }
      
      public void howToColor() {

      System.out.println ("Color all four sides");

      }    
      
      public Square (double side) {
      this.side = side;
      
      }
      
      public Square (double side, String color, boolean filled) {
      this.side = side;
      setColor(color);
      setFilled(filled);
      
      }
      
      public double getSide () {
      return side;
      
      }
      
      public void setSide (double side) {
      this.side = side;
      
      }
      
      public double getArea () {
      return side * side;
      
      }
      
      public double getPerimeter () {
      return side * 4;
      
      }
      
}
