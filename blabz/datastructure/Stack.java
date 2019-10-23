package com.blabz.datastructure;

import com.blabz.Utility.Utility;

public class Stack {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	Utility utility=new Utility();
	int ch;
	do
	{
	System.out.println("1.push");
	System.out.println("2.pop");
	System.out.println("3.peek");
	System.out.println("4.display");
	System.out.println("5.size");
	System.out.println("6.isEmpty");
	
	System.out.println("Enter ur choice");
	ch=utility.ReadIntegers();
	
	switch(ch)
	{
	case 1:
	
		System.out.println("Enter Element");
		int element=utility.ReadIntegers();
		utility.stackpush(element);
	
		break;
	
	case 2:
		utility.stackpop();
		break;
		
	case 3:
		utility.stackpeek();
		break;
		
	case 4:
		utility.stackdisplay();
		break;
		
	case 5:
		utility.stacksize();
		break;
		
	case 6:
		utility.stackisEmpty();
		break;
		
	default:
		System.out.println("Invalid choice");
		
	}
}while(ch!=7);
}
}