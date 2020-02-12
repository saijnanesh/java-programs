package com.cg.lab5.exercise5;

public class AgeException {
	
	public void age(int Age)
	{
		try {
				if(Age<=15) {
					throw new InvalidAge("Age should be greater than 15");
				}
				else
				{
					System.out.println("Age is : " + Age);
				}
		}
		catch(InvalidAge e)
		{
			System.out.println("Exception Occured "+e);
		}
	}

}
