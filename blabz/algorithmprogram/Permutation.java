package com.blabz.algorithmprogram;

import java.util.Scanner;

public class Permutation {
public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
		String str =scanner.nextLine(); 
		int n = str.length(); 
		Permutation obj = new Permutation(); 
		obj.permute(str, 0, n - 1); 
	} 

	private void permute(String str, int first, int last) 
	{ 
		if (first == last)
		{
			System.out.println(str);
		}
		else 
		{ 
			for (int i = first; i <= last; i++) 
			{ 
				str = swap(str, first, i); 
				permute(str, first + 1, last); 
           
           	} 
		} 
	} 


	public String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i]; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 
} 
