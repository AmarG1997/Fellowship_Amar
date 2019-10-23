package com.blabz.logical_program;

import com.blabz.Utility.Utility;

public class StopWatch {
public static void main(String[] args) {
	Utility utility=new Utility();
	
	System.out.println("Enter 1 for START stopwatch");
	int n1=utility.ReadIntegers();
	
	System.out.println("Enter 2 for STOP stopwatch");
	int n2=utility.ReadIntegers();

	utility.StopWatch(n1, n2);
}
}
