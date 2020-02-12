package com.cg.lab5.exercise2;

public class Fibonocci {
	public void fib(int n){
		int i,a=1,b=1,c; 
		System.out.println(a + " " + b);
		for(i=1;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(a + " " + b);
		}
	}


}
