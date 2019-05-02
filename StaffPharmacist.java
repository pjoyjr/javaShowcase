// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//
// pjoyjr

// By: Paul Joy

public class StaffPharmacist extends Employee{
  
  //attributes for StaffPharmacists
  private boolean licensed;
  
  //default constructor
  public StaffPharmacist(int x, String first, String last,double payRate){
    super(x,first,last,payRate);
    licensed = true;
  }
 
  @Override
  public void printEmployee(){
    super.printEmployee();
    System.out.format("\tLicensed: %b",licensed);
  }
}