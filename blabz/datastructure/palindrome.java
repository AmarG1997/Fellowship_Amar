package com.blabz.datastructure;

import com.blabz.Utility.Utility;

public class palindrome {
@SuppressWarnings("static-access")
public static void main(String[] args) 
{
	Utility utility=new Utility();
	System.out.println("Enter String");
	String str=Utility.readString();
	utility.palindromeChecker(str);

	
}
}
