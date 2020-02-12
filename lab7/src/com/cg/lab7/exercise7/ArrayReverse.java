package com.cg.lab7.exercise7;
import java.util.*;
public class ArrayReverse {
	public void reversingArray(int[] a)
	{
		StringBuffer s[] = new StringBuffer[a.length];
		for(int i=0;i<s.length;i++)
		{
			s[i].append(""+a[i]);
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].reverse();
		}
		String str[] = new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			str[i]=s.toString();
		}
		
		List<String> reverse = new ArrayList<String>();
		for(String temp : str)
		{
			reverse.add(temp);
		}
		Collections.sort(reverse);
		System.out.println(reverse);
	}
}
