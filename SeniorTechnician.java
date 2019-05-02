// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//
// pjoyjr

// By: Paul Joy

public class SeniorTechnician extends StaffTechnician{
  
  //attributes for SeniorTechnicians
  private boolean serviceAward;
  
  //default constructor
  public SeniorTechnician(int x, String first, String last,double payRate){
    super(x,first,last,payRate);
    serviceAward = true;
  }
  
  @Override
  public void printEmployee(){
    super.printEmployee();
    System.out.format("\tHas Service Award: %b", serviceAward);
  }
  
}