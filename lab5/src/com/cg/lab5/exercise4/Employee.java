package com.cg.lab5.exercise4;

public class Employee {
	
	public void empExcep(String firstName,String lastName)
	{
		try {
				if(firstName.isEmpty() || lastName.isEmpty()) {
					throw new InvalidEmployeeName("Where is name dude");
				}
				else
				{
					System.out.println("Name is : " + firstName + lastName);
				}
		}
		catch(InvalidEmployeeName e)
		{
			System.out.println("Exception Occured "+e);
		}
	}

}
