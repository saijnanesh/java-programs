package com.cg.lab7.exercise5;
import java.util.*;
public class SortingInArray {
	public int getSecondSmall(int a[])
	{
		List<Integer> list = new ArrayList<Integer>();
		for(Integer num : a)
		{
			list.add(num);
		}
		Collections.sort(list);
		int num=list.get(1);
		return num;
		
	}
}
