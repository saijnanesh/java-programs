package com.cg.lab3.exercise2;
import java.util.*;
public class StringConversionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter n");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		StringConversion SC = new StringConversion();
		SC.stringSort(str);
		SC.conversion(str);
		

	}

}
