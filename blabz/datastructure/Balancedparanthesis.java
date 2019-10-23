package com.blabz.datastructure;

import java.util.Stack;

import com.blabz.Utility.Utility;

@SuppressWarnings("unused")
public class Balancedparanthesis {
public static void main(String[] args) {
	Utility utility=new Utility();
	boolean flag=false;
	System.out.println("Enter Equation");
	@SuppressWarnings("static-access")
	String str=utility.readString();
	
  	boolean result=utility.stringBalancedParanthesis(str);
	if(result==true)
	{
		System.out.println("balanced");
	}
	else {
		System.out.println("not balanced");
	}
}
}
