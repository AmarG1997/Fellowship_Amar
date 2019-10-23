package com.blabz.algorithmprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter String 1");
	String a=scanner.nextLine();
	System.out.println("Enter 2nd string");
	String b=scanner.nextLine();
	
	char a1[]=a.toCharArray();
	char b1[]=b.toCharArray();
	Arrays.sort(a1);
	System.out.println(a1);
	Arrays.sort(b1);
	System.out.println(b1);

	for(int i=0;i<b1.length;i++)
	{
		if(a1[i]==b1[i])
		{
			System.out.println("Anagram");
			break;
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}
}
