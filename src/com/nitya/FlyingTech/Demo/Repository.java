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
   private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
   /**
    * 
    * @param empId
    * @return
    */
	public static Employee getEmployee(int empId) {
		employeeList = generateEmployee();

	}
    /**
     * 
     * @param firstName
     * @return
     */
	public static Employee getEmployee(String firstName) {
     		
		
	}
    /**
     * 
     * @param lastName
     * @return
     */
	public static Employee getEmployee(String lastName) {
        
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
		
	}
}
