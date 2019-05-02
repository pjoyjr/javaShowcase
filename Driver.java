// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//
// pjoyjr

// By: Paul Joy

import java.util.Scanner;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.File;

public class Driver
{
  
  public static void main(String[] args)
  {
    
    //initalize scanner, menuOption
    Scanner sc = new Scanner(System.in);
    int menuOption = 0,menuOption2 = 0;
    double hoursWorked =0;
    int count = 0; //used for placing employees into array
    int counter = -1; //counter for counting employees in file
    boolean areHoursEntered = false;
    try 
    {
      Scanner file = new Scanner(new File("employees.txt"));
      while(file.hasNextLine())
      {
        counter = counter + 1;
        file.nextLine();
      }
      file.close();
      //System.out.format("%d employees loaded\n",counter);
    }catch(FileNotFoundException ex1){
      System.out.println("File not Found!");
    }
    Employee[] company = new Employee[counter]; //array used for storing Employees
    
    System.out.println("1) Load Employees (From File) \n2) Exit Program \n"); 
    System.out.print("Please enter your selection: ");
    //only take in ints
    while(!sc.hasNextInt())
    {
      sc.next();
      System.out.println("Please enter a 1 or 2");
    }
    menuOption = sc.nextInt();
    
    while(menuOption !=2)
    {
      if(menuOption == 1)
      {
        
        try 
        {
          InputStream inputStream = new FileInputStream("employees.txt");
          InputStreamReader reader = new InputStreamReader(inputStream);
          BufferedReader buffer = new BufferedReader(reader);
          
          // Get's the first line in the file.(header)
          String line = buffer.readLine();
          //Start with the second line
          line = buffer.readLine();
          
          while(line!= null)
          {
            StringTokenizer st = new StringTokenizer(line,","); //split string at ,
            int jobID = Integer.parseInt(st.nextToken()); //parse string to int
            int id = Integer.parseInt(st.nextToken()); //parse string to int
            switch(jobID) //apply job title based on jobid
            {
              case 1:
                PharmacyManager pharmManager = new PharmacyManager(id,st.nextToken(),st.nextToken(),50.00);
                company[count] = pharmManager;
                count= count+1;
                //System.out.println("Created 1");
                break;
              case 2:
                StaffPharmacist staffPharm = new StaffPharmacist(id,st.nextToken(),st.nextToken(),40.00);
                company[count] = staffPharm;
                count= count+1;
                // System.out.println("Created 2");
                break;
              case 3:
                StaffTechnician staffTech = new StaffTechnician(id,st.nextToken(),st.nextToken(),20.00);
                company[count] = staffTech;
                count= count+1;
                //System.out.println("Created 3");
                break;
              case 4:
                SeniorTechnician srTech = new SeniorTechnician(id,st.nextToken(),st.nextToken(),25.00);
                company[count] = srTech;
                count= count+1;
                // System.out.println("Created 4");
                break;
            }
            line = buffer.readLine(); //check next line
          }
          
          //close input streams
          buffer.close();
          reader.close();
          inputStream.close();
        }catch (IOException ex) {
          System.err.println(ex);
        }
        System.out.println("\nEmployees Loaded From File!");
        
        
        //**********
        while(menuOption !=2){
          System.out.println("\n1) Print Employee Information \n2) Enter Hours Worked \n3) Calculate Paychecks \n4) Exit Program \n");
          System.out.print("Please enter your selection: ");
          while(!sc.hasNextInt())
          {
            System.out.print("Please enter your selection (1-4): ");
            sc.next();
          }
          menuOption2 = sc.nextInt();
          switch(menuOption2){
            case 1:
              System.out.println("Players data");
              System.out.println();
              for(int i=0; i < company.length; i++)
              {
                company[i].printEmployee(); //print employees in the array
              }
              break;
            case 2:
              for(int z=0; z < company.length; z++){
              System.out.println("Please enter the hours worked for " + company[z].getName() + ":");
              while(!sc.hasNextDouble())
              {
                sc.next();
              }
              hoursWorked = sc.nextDouble();
              company[z].setHoursWorked(hoursWorked);
            }
              areHoursEntered = true; //allows for user to access menuoption2 = 3
              // System.out.format("Entered %d hours", hoursWorked);
              break;
            case 3:
              // System.out.println("calculate");
              if(areHoursEntered == false){
              System.out.println("Please enter the hours worked (Option #2) before trying to calculate the paycheck amounts!");
            }else{
              for(int j=0; j < company.length; j++)
              {
                company[j].printPaycheck();
              }
            }
            break;
            case 4:
              menuOption = 2;
              break;
            default: 
              System.out.println("invalid Choice.. Please Try again.");
              break;
          }
          
        }
        //        
        
      }else if (menuOption!= 2){
        System.out.println("Please select 1 or 2..");
        
        while(!sc.hasNextInt())
        {
          sc.next();
          System.out.println("invalid Choice.. Please Try again.");
        }
        menuOption = sc.nextInt();
      }
    }
    
    System.out.println("\nGoodbye!");
    sc.close(); //close scanner
  }
}