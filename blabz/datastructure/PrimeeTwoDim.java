package com.blabz.datastructure;

import com.blabz.Utility.Utility;

public class PrimeeTwoDim {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int prime[] = utility.primeno();

//	for(int i=0;i<prime.length;i++)
//	{
//		System.out.println(prime[i]);
//	}
		int k = 0;
		int count=0;
		int[] temp = new int[200];
		int arr[][] = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			for (int j = k; j < k + 100; j++) {
				if (prime[j] < k + 100) {
					count++;
					temp[j] = j;
				}
			}
			k = k + 100;
			
			arr[i]=new int[count];
			System.out.println();
		}
	}

}
