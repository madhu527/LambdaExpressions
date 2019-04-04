package com.capgemini.com.client;

import java.util.Comparator;

import com.capgemini.lamda.model.Employee;

class EmployeeClient {
	
	public static void main(String []args) {
		
	
		Comparator<Employee> c=new Comparator<Employee>() {
		 	
		
		@Override
		public int compare(Employee e1,Employee e2) {
			return Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
		}
		Comparator <Employee> c=(e1,e2) 
				TreeSet<Employee> employees=new TreeSet<>(c);
				employees.add(new Employee(101,"madhu","cse",30000));
				employees.add(new Employee(101,"sai","ece",40000));
				employees.add(new Employee(101,"kiran","civil",50000));
				employees.add(new Employee(101,"raj","mech",20000));
				for(Employee employee:employees) {
					System.out.println(employees);
				}
		}
	}
}
				
	