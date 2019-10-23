package com.blabz.basic_core_program;

import java.util.Scanner;

public class Prime_Factor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		while (n % 2 == 0) { 
            System.out.print(2 + " "); 
            n=n/2;
        } 
  for(int i=3;i<n;i+=2)
  {
	  while(n%i==0)
	  {  System.out.println(i+"");
	  n=n/i;
	  }
  }
}
}
