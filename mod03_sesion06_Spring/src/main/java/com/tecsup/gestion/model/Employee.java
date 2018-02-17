package com.tecsup.gestion.model;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

public class Employee extends Credential {

	int employeeId;

	@NotEmpty
	String firstname;

	@NotEmpty
	String lastname;
		
	@Range(min = 850, max = 4000)
	int salary;
	
	int departmentId;

	/**
	 * 
	 * @param login
	 * @param password
	 * @param firstname
	 * @param lastname
	 * @param salary
	 */
	public Employee(String login, String password, String firstname, String lastname, int salary, int departmentId) {
		super(login, password);
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.departmentId = departmentId;
	}

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeID) {
		this.employeeId = employeeID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [login=" + login + ", password=" + password + ", employeeId=" + employeeId + ", firstname="
				+ firstname + ", lastname=" + lastname + ", salary=" + salary + ", departmentId=" + departmentId  + "]";
	}

}
