package com.cg.lab7.exercise6;

import java.util.*;

public class VoterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		int age;
		int id;
		System.out.println("Enter age and id");
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<size;i++)
		{
			age=sc.nextInt();
			id=sc.nextInt();
			hm.put(age, id);
		}
		Voter v = new Voter();
		System.out.println(v.voterId(hm));
	}

}
