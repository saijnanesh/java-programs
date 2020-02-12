package com.cg.lab6.exercise8;

import java.util.Scanner;

public class CheckSPositivetringMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=scan.nextLine();
		
		CheckSPositivetring obj=new CheckSPositivetring();
		boolean ispositive=obj.isPositive(s1);
		if(ispositive)
			System.out.println("String is positive !!");
		else
			System.out.println("String is Negative!!");
		scan.close();

	}

}








