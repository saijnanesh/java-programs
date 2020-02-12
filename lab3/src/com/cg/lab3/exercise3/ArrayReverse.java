package com.cg.lab3.exercise3;

public class ArrayReverse {
	public void getSorted(int arr[])
	{
		int b[] = new int[arr.length];
		
		StringBuffer s[] = new StringBuffer[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			s[i] = new StringBuffer(""+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			s[i].reverse();
		}
		String s1[]= new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			s1[i]=s[i].toString();
		}
		for(int i=0;i<arr.length;i++)
		{
			b[i] = Integer.parseInt(s1[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("reversed array is : " + b[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(b[i]<b[j])
				{
					int temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Sorted array is : " + b[i]);
		}
		
	}
	

}
