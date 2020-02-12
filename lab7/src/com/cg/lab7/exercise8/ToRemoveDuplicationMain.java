package com.cg.lab7.exercise8;

import java.util.Scanner;

public class ToRemoveDuplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter size");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		TOremoveDuplication td = new TOremoveDuplication();
		td.duplication(a);
	}

}
