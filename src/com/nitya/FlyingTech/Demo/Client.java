package com.nitya.FlyingTech.Demo;

/**
 * 
 * This class is client class Used to call employee class and give details of
 * employee.
 * 
 * @author vamshi krishna
 * 
 */
public class Client {
	/**
	 * this is main method from where execution starts
	 * 
	 * @param args
	 *            - can give any number of arguements here
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//get Employee by emp id is 1000
    	Employee emp = Repository.getEmployee(1000);
		
		// call emp to string so that we can print formated object data.
		System.out.println(emp.toString());
	
       
		System.out.println(Repository.getEmployee(1001).toString());
		
		
	}

}
