package com.cg.lab10.exercise2;

import java.util.Scanner;

public class CharacterSpaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharacterSpace sc = (output)->
			{
				char[] c=new char[output.length()+(output.length()-1)];
				 for(int i=0;i<c.length;i++)
					 c[i]=' ';
				int length=c.length;
				int index=output.length()-1;
				for(int i=length-1;i>=0;i=i-2)
				{
					c[i]=output.charAt(index--);
				}
				String s1=new String(c);
				return s1;
			};
			System.out.println(sc.space("jnanesh"));
	}
}
