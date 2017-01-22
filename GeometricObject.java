
/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to GeometricObject class
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

public class GeometricObject {

    private String color;
    private boolean filled;
    private String creationDate;

    public GeometricObject () {
    
    }
    
    public GeometricObject (String creationDate, String color, boolean filled) {
    this.creationDate = creationDate;
    this.color = color;
    this. filled = filled;
    
    }
    
    public String getCreationdate () {
    return creationDate;
    
    }
    
    public void setCreationdate (String creationDate) {
    this.creationDate = creationDate;
    
    }
    
    public String getColor () {
    return color;
    
    }
    
    public void setColor (String color) {
    this.color = color;
    
    }
    
    public boolean isFilled () {
    return filled;
    
    }
    
    public void setFilled (boolean filled) {
    this.filled = filled;
    
    }

 
}
