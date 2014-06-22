
package com.nitya.FlyingTech.Demo;
/**
 * This class name is  Employee and used to jus define getter ,setter methods
 * @author vamshikrishna
 *
 */
public class Employee {
	/**
	 * @see firstName to store firstname of an employee
	 */
	private String firstName;
	/**
	 * @see empId To store id of an employee
	 */
	private int empId;
	/**
	 *@see salary To store salary of an employee
	 */
	private float salary;
	/**
	 * @see lastName To store lastname of an employee
	 */
	private String lastName;
/**
 * this is constructor with four paramters i.e details of employee
 * @param empId1 
 * @param firstName1
 * @param lastName1
 * @param salary1
 */
	public  Employee(int empId1,String firstName1,String lastName1,int salary1){
		firstName=firstName1;
		lastName=lastName1;
		empId=empId1;
		salary=salary1;
	}
	/**
	 * Getter method for empid to take id of employee
	 * @return empid
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * setter method for empid
	 * @param empId
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * getter method for firstname
	 * @return firstname 
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setter method for firstname of an employee
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getter method for lastname
	 * @return lastname
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * setter method for lastname to store string
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * getter method for salary
	 * @return salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * setter method for salary to set salary for employee
	 * @param salary
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
//		return "Employee [firstName=" + firstName + ", empId=" + empId
//				+ ", salary=" + salary + "]";
		return "Employee [ Employeeid is "+empId+",Firstname is "+firstName+""
				+ ", Lastname is "+lastName+", and salary = "+salary+" ]";
	}
	
	
}

