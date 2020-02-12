package com.cg.lab3.exercise1;

public class SecondSmall {
	public int getSecondSmall(int a[])
	{
		int temp,i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
		
	}

}
