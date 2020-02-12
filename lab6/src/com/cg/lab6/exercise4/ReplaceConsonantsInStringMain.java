package com.cg.lab6.exercise4;

import java.util.Scanner;

public class ReplaceConsonantsInStringMain {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter String");
	
	String input=scan.nextLine();
	ReplaceConsonantsInString obj=new ReplaceConsonantsInString();
	System.out.println(obj.alterString(input));
	
}
}