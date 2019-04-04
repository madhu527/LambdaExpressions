package com.capgemini.lamda.model;

public class Employee {
	 
	double employeeId;
	String employeeName;
	String employeeDept;
	double employeeSalary;
	public Employee() {
		 
	}
	public Employee(double employeeId, String employeeName, String employeeDept, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeSalary = employeeSalary;
	}
	public double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(double employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeDept == null) ? 0 : employeeDept.hashCode());
		long temp;
		temp = Double.doubleToLongBits(employeeId);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		temp = Double.doubleToLongBits(employeeSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeDept == null) {
			if (other.employeeDept != null)
				return false;
		} else if (!employeeDept.equals(other.employeeDept))
			return false;
		if (Double.doubleToLongBits(employeeId) != Double.doubleToLongBits(other.employeeId))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(employeeSalary) != Double.doubleToLongBits(other.employeeSalary))
			return false;
		return true;
	}
	/* @override
	 public int hashCode() {
		 return Objects.hash(employeeId,employeeName);
	 }*/
	 
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	

	 }
