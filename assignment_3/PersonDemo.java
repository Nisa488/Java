package assignment_3;
//3 4ü
//Base class Human
class Person {
 public String getFirstName() {
     return "Alice";
 }

 public String getLastName() {
     return "Smith";
 }
}

//Subclass Worker extends Person
class Employee extends Person {
 @Override
 public String getLastName() {
     // Adding job title to the last name
     return super.getLastName() + " (Position: Employee)";
 }

 public String getOccupation() {
     return "Employee";
 }
}

//Demo class to run the program
public class PersonDemo {
 public static void main(String[] args) {
     // Create an Employee object
     Employee employee = new Employee();

     // Print first name, last name with job title, and occupation
     System.out.println("First Name: " + employee.getFirstName());
     System.out.println("Last Name: " + employee.getLastName());
     System.out.println("Occupation: " + employee.getOccupation());
 }
}

