package com.cg.lab5.exercise4;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName,lastName;
		System.out.println("Enter first name : ");
		Scanner sc= new Scanner(System.in);
		firstName = sc.nextLine();
		System.out.println("Enter last name : ");
		lastName = sc.nextLine();
		Employee en = new Employee();
		en.empExcep(firstName,lastName);

	}

}
