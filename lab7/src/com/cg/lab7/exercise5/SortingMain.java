package com.cg.lab7.exercise5;

import java.util.Scanner;

public class SortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter Array Size");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		SortingInArray sa = new SortingInArray();
		System.out.println(sa.getSecondSmall(a));
		
	}

}
