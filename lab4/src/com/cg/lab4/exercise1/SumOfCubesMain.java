package com.cg.lab4.exercise1;
import java.util.*;
public class SumOfCubesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter the digit");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		SumOfCubes so = new SumOfCubes();
		int l=so.SumofCubes(n);
		System.out.println(l);

	}

}
