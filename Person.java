/**
 * Class: CIST 2371 Introduction to Java
 * Quarter: Summer 2015
 * Instructor: William Pegg
 * Description: Solution to Person class
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

public class Person {
 
private String name;
private String address;
private String phone; 
private String email;

 public Person(){

 }

 public Person(String name){

 this.name = name;

 this.address = address;

 this.phone = phone;

 this.email = email;

 }

 

 public String getName(){
 return name;

 }

 

 public void setName(String name){

 this.name = name;

 }

 

 public String getAddress(){
 return address;
 }

 

 public void setAddress(String address){
 this.address = address;

 }
 

 public String getPhone(){
 return phone;

 } 

 public void setPhone(String phone){
 this.phone = phone;

 }

 

 public String getEmail(){
 return phone;

 }

 

 public void setEmail(String email){
 this.email = email;

 }

 

 @Override

 public String toString(){
 return "Classname = " + getClass().getName() + ", name = " + this.name;

 }

 }
