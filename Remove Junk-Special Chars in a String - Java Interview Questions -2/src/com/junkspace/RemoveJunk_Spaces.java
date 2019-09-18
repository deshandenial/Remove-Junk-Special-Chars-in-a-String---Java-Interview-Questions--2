package com.junkspace;

public class RemoveJunk_Spaces 
{
	public static void main(String[] args) 
	{
	
		String s = "@#$#$$ Selenium #$$#$ Programmer";
		
		// Regular Expression [^a-zA-Z0-9] 
		
		String result = s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(result);
	}

}
