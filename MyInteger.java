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
 // @Citation: 
// URL: http://www.dreamincode.net/forums/topic/189144-myinteger-class/
// AUTHOR: xterradaniel
// Date: 07/12/15


// create class
class MyInteger {

 
// create instance variable
   int num;

 

    MyInteger(int newNum) {

        num = newNum;

    }

 

    public int getNum() {

        return num;

    }

 
// create methods 
    public static boolean isEven(int n) {

        return (n % 2 == 0);

    }

 

    public static boolean isOdd(int n) {

        return !isEven(n);

    }

 

    public static boolean isPrime(int n) {

    for (int f = 2; f < n / 2; f++) {

            if (n % f == 0) {

            return false;

            }

        }

        return true;

    }

 

    public static boolean isEven(MyInteger n) {

        return n.isEven();

    }

 

    public static boolean isOdd(MyInteger n) {

        return n.isOdd();

    }

 

    public static boolean isPrime(MyInteger n) {

        return n.isPrime();

    }

 

    public boolean isEven() {

        return isEven(num);

    }

 

    public boolean isOdd() {

        return isOdd(num);

    }

 

    public boolean isPrime() {

        return isPrime(num);

    }

 

    public boolean equals(int n) {

        return (num == n);

    }

 

    public boolean equals(MyInteger n) {

        return equals(n.getNum());

    }

 

    public static int parseInt(String s) {

        return Integer.parseInt(s);

    }

 

    public static int parseInt(char[] s) {

        return parseInt(new String(s));

    }

} // class
