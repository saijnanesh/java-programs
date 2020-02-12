package com.cg.lab5.exercise5;
import java.util.*;
public class AgeExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Age;
		System.out.println("Enter Age : ");
		Scanner sc= new Scanner(System.in);
		Age = sc.nextInt();
		AgeException ae = new AgeException();
		ae.age(Age);

	}

}
