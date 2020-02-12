package com.cg.lab4.exercise1;

public class SumOfCubes {
	public int SumofCubes(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=((n*n)*(n+1)*(n+1))/4;
		}
		return sum;
		
	}


}
