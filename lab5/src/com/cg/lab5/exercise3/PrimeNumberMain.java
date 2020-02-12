package com.cg.lab5.exercise3;
import java.util.*;
public class PrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,p;
		System.out.println("enter p");
		Scanner sc = new Scanner(System.in);
		p=sc.nextInt();
		PrimeNumber pn = new PrimeNumber();
		pn.prime(p);
	
	}

}
