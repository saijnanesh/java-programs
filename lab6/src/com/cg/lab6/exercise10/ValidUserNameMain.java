package com.cg.lab6.exercise10;

import java.util.Scanner;

public class ValidUserNameMain {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        String userName=scan.nextLine();
        
        ValidUserName obj=new ValidUserName();
       boolean isValid= obj.isValid(userName);
        if(isValid)
        	System.out.println("Valid UserName");
        else
        	System.out.println("Not a Valid UserName!!");
       scan.close();
	}
}