// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//
// pjoyjr

// By: Paul Joy

public class PharmacyManager extends StaffPharmacist{
  
  //attributes for PharmacyManagers
  private boolean leadership;
  
  //default constructor
  public PharmacyManager(int x, String first, String last,double payRate){
    super(x,first,last,payRate);
    leadership = true;
  }
  
  @Override
  public void printEmployee(){
    super.printEmployee();
    System.out.format("\tHas Leadership: %b",leadership);
  }
}