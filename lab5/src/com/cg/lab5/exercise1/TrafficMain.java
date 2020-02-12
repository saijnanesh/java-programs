package com.cg.lab5.exercise1;
import java.util.*;
public class TrafficMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.println("enter the traffic colors");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		Traffic t = new Traffic();
		t.trafficLights(name);

	}

}
