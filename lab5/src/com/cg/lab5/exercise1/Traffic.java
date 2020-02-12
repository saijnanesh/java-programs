package com.cg.lab5.exercise1;

public class Traffic {
	public void trafficLights(String name)
	{
		switch(name)
		{

		case "red" : System.out.println("Stop");
					 break;
		case "yellow" : System.out.println("Ready");
					 break;
		case "green" :System.out.println("go");
					 break;
		default : System.out.println("Wrong Choice");
		}
	}

}
