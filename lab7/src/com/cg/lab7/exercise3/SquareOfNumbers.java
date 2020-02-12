package com.cg.lab7.exercise3;
import java.util.*;
public class SquareOfNumbers {

	public Map<Integer,Integer >getSquares(int a[])
	{
		int sum=1;
		int visited=-1;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=visited;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=visited);
			{
				sum=a[i]*a[i];
				hm.put(Math.abs(a[i]), sum);
			}
		}
		return hm;
	
	}
} 
