
package com.nitya.FlyingTech.Demo;
/**
 * 
 * @author yari_uygur
 *
 */
public class Employee {
	/**
	 * explain field
	 */
	private String firstName;
	/**
	 * explain field
	 */
	private int empId;
	/**
	 * explain field
	 */
	private float salary;
	
	public Employee(){	
	}
	public  Employee(String firstName1,int empId1,float salary1){
		firstName=firstName1;
		empId=empId1;
		salary=salary1;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", empId=" + empId
				+ ", salary=" + salary + "]";
	}
	
}

