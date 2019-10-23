package com.blabz.logical_program;

import com.blabz.Utility.Utility;

public class Gambler {
public static void main(String[] args) {
	Utility utility=new Utility();
	System.out.println("Enter how many times u want to bets");
	int n=utility.ReadIntegers();
	System.out.println("Enter Cash");
	int cash=utility.ReadIntegers();
	System.out.println("Enter goal");
	int goal=utility.ReadIntegers();
	utility.Gambling(n, cash, goal);
}
}
