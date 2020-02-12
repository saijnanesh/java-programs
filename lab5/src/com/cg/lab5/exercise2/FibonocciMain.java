package com.cg.lab5.exercise2;
import java.util.*;
public class FibonocciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter nth number");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		Fibonocci f = new Fibonocci();
		f.fib(n);
	
	}

}
