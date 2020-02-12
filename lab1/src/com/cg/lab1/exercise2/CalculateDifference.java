package com.cg.lab1.exercise2;

public class CalculateDifference {
	int n,sum1=0,sum2=0,i,diff;
	public int sumOfTheSquares(int n)
	{
		for(i=0;i<=n;i++)
		{
			sum1=sum1+i*i;
		}
		return sum1;
	}
	
	public int  squaresOfTheSum(int n)
	{
		int c=0;
		for(i=0;i<=n;i++)
		{
			c=c+i;
		}
		sum2=c*c;
		return sum2;
	}
	
	public void difference()
	{
		diff=Math.abs(sum1-sum2);
		System.out.println(diff);
	}
	
	
	

}
