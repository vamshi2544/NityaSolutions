package com.nitya.FlyingTech.Demo;

import java.util.ArrayList;

/**
 * 
 * @author yari_uygur
 * 
 */
public class Repository {
	/**
	 * 
	 */
   public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
   
    static Employee emp1 = new Employee("vamshi",1000,10000);
   static Employee emp2 = new Employee("nikhil",1001,10002);

 static Employee emp3=new Employee("sai",1002,5000);
 static Employee emp4=new Employee("shiva",1003,5000);  
 static Employee emp5=new Employee("sai kumar",1004,5000);
 static Employee emp6=new Employee("nithin",1005,5000);
 static Employee emp7=new Employee("kalyan",1006,5000);
 static Employee emp8=new Employee("tapan",1007,5000);
 
   /**
    * 
    * @param empId
    * @return
    */
	public static Employee getEmployee(int empId) {
		employeeList = generateEmployee();
		return emp1;
	}
	
    /**
     * 
     * @param firstName
     * @return
     */
	public static Employee getEmployee(String firstName) {
		return firstName;		
		
	}
    /**
     * 
     * @param lastName
     * @return
     */
	public static Employee getEmployee(String lastName) {
		return lastName;
        
	}
	/**
	 * 
	 * @return
	 */
	private static ArrayList<Employee> generateEmployee() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		/**
		 * generate your employee and return
		 */
	
		employeeList.add(emp1);	
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);
		return employeeList;

			
	}


public static void main(String args[]) {
Repository	r = new Repository();
System.out.println(r);
}
}