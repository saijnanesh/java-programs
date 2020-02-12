package com.cg.lab7.exercise2;
import java.util.*;
public class CharacterOccurance {
	
		 public Map<Character,Integer> countCharacter(char[] arr)
		  {
			  Map<Character,Integer>output=new LinkedHashMap<Character,Integer>();
			  
			  for(int i=0;i<arr.length;i++)
			  {
				  if(output.containsKey(arr[i]))
				  {
					  output.put(arr[i], output.get(arr[i])+1);
				  }
				  else
				  {
					  output.put(arr[i],1);
				  }
			  }
			  
			  return output;
		  }

}
