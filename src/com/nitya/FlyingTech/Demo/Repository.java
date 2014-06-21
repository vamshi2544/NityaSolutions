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
	//using for loop, loop throw the employeeList if employee id is
//		equal to empId, then return that employee
		for (int i=0;i<=employeeList;i++) {
			empId= 
		}
		return emp1;
	}

	/**
	 * 
	 * @param firstName
	 * @return
	 */
	public static Employee getEmployee(String firstName) {
		//using for loop, loop throw the employee  if employee firstname euqal to firstName then return the employee

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
		/**
		 * generate your employee and return
		 */
		Employee emp1 = new Employee("vamshi", 1000, 10000);
		Employee emp2 = new Employee("nikhil", 1001, 10002);
		Employee emp3 = new Employee("sai", 1002, 5000);
		Employee emp4 = new Employee("shiva", 1003, 5000);
		Employee emp5 = new Employee("sai kumar", 1004, 5000);
		Employee emp6 = new Employee("nithin", 1005, 5000);
		Employee emp7 = new Employee("kalyan", 1006, 5000);
		Employee emp8 = new Employee("tapan", 1007, 5000);

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
		Repository r = new Repository();
		System.out.println(r);
	}
}