package com.cg.lab3.exercise3;
import java.util.*;
public class ArrayReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter array size : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayReverse ar = new ArrayReverse();
		ar.getSorted(arr);

	}

}
