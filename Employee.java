// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//
// pjoyjr

// By: Paul Joy

public class Employee{
  
  //attributes for Employees
  private String fName, lName;
  private int id;
  private double hourlyRate;
  private double hoursWorked;
  
  //default constructor
  public Employee(){
  }
  
  //overloaded constructor
  public Employee(int x, String first, String last, double pay){
    id = x;
    fName = first;
    lName = last;
    hourlyRate = pay;
  }
  
  public void printEmployee(){
    System.out.format("\nID: %-8d\tName: %-15s %-20s\tRate: %.2f", id, fName, lName,hourlyRate);
  }
  public void printPaycheck(){
    double money = hoursWorked * hourlyRate; //calcs paycheck
    System.out.format("\nID: %-8d\tCheck Amount: $%.2f", id,money);
  }
  public void setHoursWorked(double hours){
  hoursWorked = hours;
  }
  public String getName(){
   String fullName = fName + " " + lName;
      return fullName;
  }
}