package com.cg.lab7.exercise1;

import java.util.*;

public class HashMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
	
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("sai",5);
		hm.put("w",6);
		hm.put("i",1);
		hm.put("a",0);
		hm.put("s",4);
	SortingInHashMap sm = new SortingInHashMap();
	sm.getValues(hm);
	
		
	}

}
