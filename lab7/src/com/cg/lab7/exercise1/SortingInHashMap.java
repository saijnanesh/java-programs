package com.cg.lab7.exercise1;
import java.util.*;
import java.io.*;
public class SortingInHashMap {
	public void getValues(HashMap<String,Integer> hm)
	{
		List<String> key = new ArrayList<String>(hm.keySet());
		List<Integer> value = new ArrayList<Integer>(hm.values());

		System.out.println("before Sorting by value");

		System.out.println(value);
		
		System.out.println("Sorting by value");
		Collections.sort(value); 
	
			System.out.println(value);
	}
}
