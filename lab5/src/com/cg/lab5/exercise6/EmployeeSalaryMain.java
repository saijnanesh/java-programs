package com.cg.lab5.exercise6;
import java.util.*;
public class EmployeeSalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary;
		System.out.println("Enter salary : ");
		Scanner sc= new Scanner(System.in);
		salary = sc.nextInt();
		EmployeeSalary es = new EmployeeSalary();
		es.salaryExcep(salary);


	}

}
