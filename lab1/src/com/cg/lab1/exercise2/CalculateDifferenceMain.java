package com.cg.lab1.exercise2;
import java.util.*;
public class CalculateDifferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		CalculateDifference O = new CalculateDifference();
		System.out.println("enter n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		O.sumOfTheSquares(n);
		O.squaresOfTheSum(n);
		O.difference();

	}

}
