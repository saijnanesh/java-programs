package com.cg.lab7.exercise3;

import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter Size");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		SquareOfNumbers sn = new SquareOfNumbers();
		System.out.println(sn.getSquares(a));
	}
	

}
