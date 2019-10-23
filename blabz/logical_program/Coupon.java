package com.blabz.logical_program;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.blabz.Utility.Utility;

public class Coupon {
public static void main(String[] args) {
	Utility utility=new Utility();
	   System.out.println("enter no of times:");
       int n=utility.ReadIntegers();
       
      HashSet hs= utility.Coupon( n);
      
       System.out.println(hs);
}
}
