package com.cg.lab6.exercise8;

public class CheckSPositivetring {

	public  boolean isPositive(String input)
	{
		boolean ispositive=true;
		input=input.toLowerCase();
		char arr[]=input.toCharArray();
		
		for(int i=1;i<arr.length;i++)
		{
		  if(!(arr[i]>arr[i-1]))
		  {
			  ispositive=false;
		  }
		}
		
		return ispositive;
	}

}
