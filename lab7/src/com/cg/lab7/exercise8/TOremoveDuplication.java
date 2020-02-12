package com.cg.lab7.exercise8;

import java.util.*;

public class TOremoveDuplication {
	public void duplication(int[] a)
	{
		Set<Integer> set= new TreeSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i);
		}
	}
}
