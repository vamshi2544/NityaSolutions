package com.nitya.FlyingTech.Demo;
/**
 * This class is to store employee details and
 * This is to show how overloading works with different parameters 
 * @author vamshikrishna
 *
 */
public class Employee_repo {
/**
 * @see firstname
 * @see Emp_id
 * @see salary
 */
	private String firstname;
	private int Emp_id;
	private float salary;
	
	
/**
 * defines employee_repo method with out parameters and default values
 * @see employee_repo method
 */
	public Employee_repo()
	{
		setFirstname("vamshi");
		setEmp_id(1001);
		setSalary(10000);
	}
	
	
	/**
	 * defines employee_repo method with single parameter
	 * @param firstname1 stores string value in it
	 */
	public Employee_repo(String firstname1)
	{
	 setFirstname(firstname1);
	}
	
	
	/**
	 * defines same method employee_repo with 2 parameters
	 * @param firstname1 
	 * @param Emp_id1
	 */
	public Employee_repo(String firstname1,int Emp_id1)
	{
		setFirstname(firstname1);
		setEmp_id(Emp_id1);
	}
	
	/**
	 * Defines Employee_repo method with three parameters. 
	 * @param firstname1
	 * @param Emp_id1
	 * @param salary1
	 */
	public Employee_repo(String firstname1,int Emp_id1,float salary1)
	{
		setFirstname(firstname1);
		setEmp_id(Emp_id1);
		setSalary(salary1);
	}
/**
 * this is a getter method of firstname
 * @return firstname : This returns stored string value in the firstname
 */
	public String getFirstname() {
		return firstname;
	}
/**
 * This is setter method for Firstname
 * @param firstname : This stores firstname 
 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
/**
 * this is getter method for emp_id
 * @return emp_id : this returns integer value of emp id.
 */
	public int getEmp_id() {
		return Emp_id;
	}
/**
 * This is a setter method for emp_id.
 * @param emp_id
 */
	public void setEmp_id(int emp_id) {
		this.Emp_id = emp_id;
	}
/**
 * this is a getter method of salary
 * @return salary: gives integer value of salary.
 */
	public float getSalary() {
		return salary;
	}
/**
 * this is a setter method for salary
 * @param salary
 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
