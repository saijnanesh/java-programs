package com.cg.lab1.exercise3;

public class IncreasingOrder {
	boolean flag;
	public boolean toCheckNumber(int n)
	{
		String s = new String(""+n);
		int length = s.length();
		char c[] = s.toCharArray();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(c[i]<c[j])
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
		}
		return flag;
	}

}
