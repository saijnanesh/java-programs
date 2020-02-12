package com.cg.lab5.exercise6;
import com.eis.Exception.*;
public class EmployeeSalary {
	public void salaryExcep(int salary)
	{
		try {
		if(salary<=3000){
			throw new EmployeeException("Salary should be above 3000");
			}
		else
		{
			System.out.println("Salary of Employee is :" + salary);
		}
		}
		catch(EmployeeException e) {
			System.out.println("Exception Occurred :" + e);
			
		}
		
	}

}
