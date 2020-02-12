package com.cg.lab7.exercise2;

import java.util.*;

public class CharCountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		CharacterOccurance co = new CharacterOccurance();
		Map<Character,Integer>output=co.countCharacter(s.toCharArray());
		for(Map.Entry<Character,Integer>me:output.entrySet())
		{
			System.out.println(me.getKey()+"-->"+me.getValue());
		}
				
	}

}
