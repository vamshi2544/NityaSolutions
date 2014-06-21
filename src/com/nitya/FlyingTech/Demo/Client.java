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
		/**
		 * just invoking new objects with method Employee_repo
		 * 
		 * @see emp1 object
		 * @see emp2 object
		 * @see emp3 object
		 * @see emp4 object
		 */
//		EmployeeRepo emp1 = new EmployeeRepo();
//		EmployeeRepo emp2 = new EmployeeRepo("vivek");
//		emp2.setEmp_id(1002);
//		EmployeeRepo emp3 = new EmployeeRepo("pradeep", 1003);
//		emp3.setSalary(6000);
//		EmployeeRepo emp4 = new EmployeeRepo("ramu", 1004, 8000);

		/**
		 * prints firstname , emp_id, salary of emp1 object
		 * 
		 * @see emp1.getfirstname
		 * @see emp1.getEmp_id
		 * @see emp1.getsalary
		 */
//		System.out.println("Firstname is " + emp1.getFirstname()
//				+ "  emp_id is " + emp1.getEmp_id() + "  salary is "
//				+ emp1.getSalary());
		/**
		 * prints firstname , emp_id, salary of emp2 object
		 * 
		 * @see emp2.getfirstname
		 * @see emp2.getEmp_id
		 * @see emp2.getsalary
		 */
//		System.out.println("Firstname is " + emp2.getFirstname()
//				+ "  emp_id is " + emp2.getEmp_id() + "  salary is "
//				+ emp2.getSalary());
		/**
		 * prints firstname , emp_id, salary of emp3 object
		 * 
		 * @see emp3.getfirstname
		 * @see emp3.getEmp_id
		 * @see emp3.getsalary
		 */
//		System.out.println("Firstname is " + emp3.getFirstname()
//				+ "  emp_id is " + emp3.getEmp_id() + "  salary is "
//				+ emp3.getSalary());
		/**
		 * prints firstname , emp_id, salary of emp4 object
		 * 
		 * @see emp4.getfirstname
		 * @see emp4.getEmp_id
		 * @see emp4.getsalary
		 */
//		System.out.println("Firstname is " + emp4.getFirstname()
//				+ "  emp_id is " + emp4.getEmp_id() + "  salary is "
//				+ emp4.getSalary());

		Repository.getEmployee(1001);
		
		
	}

}
