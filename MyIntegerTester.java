/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to MyInteger
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


import java.util.Scanner;

public class MyIntegerTester {
   
    public static void main(String[] args){
    
      char[] me = {'e','n','t','e','r','a','v','a','l','u','e'} ;
      
       String name = "My Integer";
   
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter an integer: ");
        int myInt = input.nextInt();
        
        MyInteger result = new MyInteger(num);
// Return  isEven() is true
        System.out.println("isEven():" + result.isEven());
// Return isOdd() is true
        System.out.println("IsOdd():" +  result.isOdd() );
// Return isOdd() is true
                System.out.println("IsPrime():" +  result.isPrime() );
// The equals(int)
                System.out.println("equals():" +  result.equals(num) );
//parseInt(char[]) method 
                System.out.println("parseInt(char[])" + MyInteger.parseInt(me));
// parseInt(String) method
                System.out.println("parseInt(char[])" + MyInteger.parseInt(name));
                
                input.close();        
        
                
    }
       
}

