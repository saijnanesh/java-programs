package com.cg.lab1.exercise3;
import java.util.*;
public class IncreasingOrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		IncreasingOrder io = new IncreasingOrder();
		System.out.println(io.toCheckNumber(n));

	}

}
