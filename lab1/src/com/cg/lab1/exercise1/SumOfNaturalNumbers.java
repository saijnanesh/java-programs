package com.cg.lab1.exercise1;
import java.util.*;

public class SumOfNaturalNumbers {
		public int n, sum=0;
		public int i;
		
		public int calculateSum(int n)
		{
			
			
			for(i=0;i<=n;i++)
			{
			if(i%3==0 || i%5==0)
				{
				sum=sum+i;
				}
			}
			return sum;
		}

	}


