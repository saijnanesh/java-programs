package com.cg.lab10.exercise1;
import java.util.*;
public class XPowerYMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Power xy =(x,y)->{
		double result;
		result=Math.pow(x,y);
		return (int) result;
		};
		System.out.println(xy.power(2,2));
	}

}
