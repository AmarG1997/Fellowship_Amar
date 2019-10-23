package com.blabz.algorithmprogram;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.blabz.Utility.Utility;

public class Regex 
{
	public static void main(String[] args) 
	{
		Utility util=new Utility();
		
		
	      
		String str[]="Hello <<name>> ,We have your full name as <<fullname>> in our system. your contact number is 91- xxxxxxxxxx .Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016 . ".split(" ");
		System.out.println("Enter the Name");
		String name=util.readString();
		util.Regexstring(str, name);
		
		
		System.out.println("Enter full name");
		String fullname=util.readString();
		util. Regexstringfull(str,fullname);
		
		
		System.out.println("Enter moible number");
		String moibleno=util.readString();	
		util. Regexstringmoible(str,moibleno);
		util. regexdate(str);
		 
		

		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(" " + str[i]);
		}
		
	}

}

		

