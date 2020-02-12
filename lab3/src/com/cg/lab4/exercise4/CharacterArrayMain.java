package com.cg.lab4.exercise4;
import java.util.*;
public class CharacterArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		System.out.println("enter no of array elements");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		char c[] = new char[n];
		for(i=0;i<n;i++)
		{
			c[i]=sc.next().charAt(0);
		}
		CharacterArray ca = new CharacterArray();
		ca.charArray(c);
		

	}

}
