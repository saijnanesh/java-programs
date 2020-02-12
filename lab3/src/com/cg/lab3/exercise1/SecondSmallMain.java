package com.cg.lab3.exercise1;
import java.util.*;
public class SecondSmallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter array size");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		SecondSmall ss = new SecondSmall();
		int u=ss.getSecondSmall(a);
		System.out.println(u);
	
	}

}
