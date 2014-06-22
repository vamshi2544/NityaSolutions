package com.nitya.FlyingTech.Demo;

import java.util.ArrayList;

/**
 * This class acts as database for employee details.
 * @author vamshikrishna
 * 
 */
public class Repository {
/**
* Creating a arraylist of type Employee by name employeeList to store employee details.
*/
	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();

	/**
	 * getEmployee is a method to get an employee id 
	 * @param empId to receive employee id 
	 * @return
	 */
	public static Employee getEmployee(int empId) {
	 generateEmployee();
	  Employee emp =null;
	//using for loop, loop throw the employeeList if employee id is
	//equal to empId, then return that employee
		for (int i=0;i<employeeList.size();i++) {
			if(empId==employeeList.get(i).getEmpId()) {
				emp = employeeList.get(i);
			}
		}
		return emp;
	}

	/**
	 * This getEmployee method is with a string parameter to check how overloading works
	 * @param firstName to take firstname 
	 * @return employee i.e employee details for particular firstname 
	 */
	public static Employee getEmployee(String firstName) {
		//using for loop, loop throw the employee  if employee firstname euqal to firstName then return the employee
		generateEmployee();
		  Employee emp = null;
			for (int i=0;i<employeeList.size();i++) {
				if(firstName==employeeList.get(i).getFirstName()) {
					emp = employeeList.get(i);
				}
			}

		return emp;

	}

	/**
	 * this getEmployee method has salary as its parameter
	 * @param lastName
	 * @return employee 
	 */
	public static Employee getEmployee(float Salary) {
		generateEmployee();
		Employee emp = null;
		for(int i = 0;i<employeeList.size();i++) 
		{
			if (Salary==employeeList.get(i).getSalary())	
			{
				emp = employeeList.get(i);
			}
		}
		return emp ;

	}

	/**
	 * This method is generateEmployee() used to pick a employee with required details
	 * @return employeeList
	 */
	private static ArrayList<Employee> generateEmployee() {
		/**
		 * generate employee and return
		 */
		Employee emp1 = new Employee(1000,"vamshi","Veggalam",6000);
		Employee emp2 = new Employee(1001,"nikhil","bathula",5222);
		Employee emp3 = new Employee(1002,"saikrishna","kakulamarri", 5000);
		Employee emp4 = new Employee(1003,"vivek","boddula", 5000);
		Employee emp5 = new Employee(1004,"sravani","anumula",9000);
		Employee emp6 = new Employee(1005,"nithin","mylarapu",5000);
		Employee emp7 = new Employee(1006,"pradeep","vootla", 5000);
		Employee emp8 = new Employee(1007,"tapan","*", 5000);
		Employee emp9 = new Employee(1008,"sahitya", "vemula",1002);
/**
 * added objects to the arraylist employeeList
 */
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);
		employeeList.add(emp9);
		return employeeList;

	}

}