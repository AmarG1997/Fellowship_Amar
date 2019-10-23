package com.blabz.datastructure;

import java.util.Scanner;

import com.blabz.Utility.Utility;

public class Calendar {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	Utility utility=new Utility();
	
	System.out.println("Enter month:");
	int m=utility.ReadIntegers();
	
	System.out.println("Enter year:");
	int y=utility.ReadIntegers();
	
	String month[]= {" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
	
	int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	if(m==2 && utility.isLeapYear(y))
	{
		days[m]=29;
	}
	System.out.println(" "+month[m]+" "+y);
	
	System.out.println("   S   M   T   W   TH   F   S");
	
	int d=utility.calculateDay(0,m,y);
	String cal[][]=new String[6][7];
	for (int i = 0; i < d; i++)
	{		
		cal[0][i] = "    ";
	}
	utility.calendar1(cal, d, days, m);
}
}
