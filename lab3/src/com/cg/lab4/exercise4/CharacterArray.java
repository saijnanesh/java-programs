package com.cg.lab4.exercise4;

public class CharacterArray {

	public void charArray(char c[]) 
	{
		int i,j,k=0;
		for(i=0;i<c.length;i++)
		{
			 int count=1;
			
			for(j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					k= count++;
				}
			}
			System.out.println("Number of times" + c[i] + "repeated is" + k);
		}
		
		
	}
}
