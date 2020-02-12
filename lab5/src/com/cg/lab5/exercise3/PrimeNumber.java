package com.cg.lab5.exercise3;

public class PrimeNumber {
	public void prime(int p)
	{
		int i;
		for(i=2;i<=p;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}

}
