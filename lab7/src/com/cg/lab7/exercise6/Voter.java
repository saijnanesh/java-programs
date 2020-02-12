package com.cg.lab7.exercise6;
import java.util.*;
public class Voter {
	public List<Integer> voterId(HashMap<Integer,Integer> hm)
	{
		List<Integer> idNum = new ArrayList<Integer>();
		for(Map.Entry<Integer,Integer>me:hm.entrySet())
		{
			if(me.getKey()>18)
			{
			  idNum.add(me.getValue());
			}
		}
		return idNum;
	}
}