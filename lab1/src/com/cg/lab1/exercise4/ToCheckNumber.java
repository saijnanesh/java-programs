package com.cg.lab1.exercise4;

public class ToCheckNumber {
	boolean flag;
	public boolean checkNumber(int n) {
		if(n%4==0 || n/2==1)
			flag=true;
		else
			flag=false;
		return flag;
	}
}
