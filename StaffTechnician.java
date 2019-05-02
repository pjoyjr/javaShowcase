// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//
// pjoyjr

// By: Paul Joy

public class StaffTechnician extends Employee{
  
  //attributes for StaffTechnicians
  private boolean degree;
  
  //default constructor
  public StaffTechnician(int x, String first, String last,double payRate){
    super(x,first,last,payRate);
    degree = true;
  }
  
  @Override
  public void printEmployee(){
    super.printEmployee();
    System.out.format("\tHas Degree: %b", degree);
  }
  
}