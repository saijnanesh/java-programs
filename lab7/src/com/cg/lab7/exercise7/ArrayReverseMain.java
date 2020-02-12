package com.cg.lab7.exercise7;

import java.util.Scanner;

public class ArrayReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayReverse ar = new ArrayReverse();
		ar.reversingArray(a);
	}

}
