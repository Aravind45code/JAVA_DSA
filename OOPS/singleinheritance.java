package OOPS;
//Example for single inheritance in java
class Employee{
  String eid;
  String ename;
  float esal;
  String eaddr;
  public void getEmpDetails(){
    System.out.println("Employee Id:"+eid);
    System.out.println("Employee Name:"+ename);
    System.out.println("Employee Salary"+esal);
    System.out.println("Employee Address"+eaddr);
    
  }
}
class Manager extends Employee{
  public Manager(String empId,String empName,float empSal,String empAddr){
    eid=empId;
    ename=empName;
    esal=empSal;
    eaddr=empAddr;

  }
  public void getManagerDetails(){
    System.out.println("Manager Details");
    System.out.println("------------------");
    getEmpDetails();
  }
}
public class singleinheritance {
  public static void main(String[] args){
    Manager mngr=new Manager("S-111","AAA",5000,"Hyd");
    mngr.getManagerDetails();
  }
  
}
