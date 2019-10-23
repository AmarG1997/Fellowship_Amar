package com.blabz.datastructure;

import com.blabz.Utility.Utility;

public class Queue {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	Utility utility=new Utility();
	int ch;
	 do
	 {
		 System.out.println("1.enqueueFront");
		 System.out.println("2.dequeueFront");
		 System.out.println("3.dequeueRear");
		 System.out.println("4.isEmpty");
		 System.out.println("5.size");
		 System.out.println("6.display");
		 System.out.println("7.enqueueRear");
		 System.out.println("Enter Your Choice");
		 ch=utility.ReadIntegers();
		 
		 switch(ch)
		 {
		 case 1:
			 System.out.println("Enter Element");
			 int element=utility.ReadIntegers();
			 utility.enqueueFront(element);
			 break;
			 
		 case 2:
			 utility.dequeueFront();
			 break;
			 
		 case 3:
			 utility.dequeueRear();
			 break;
			 
		 case 4:
			 utility.queueisEmpty();
			 break;
		
		 case 5: 
			 utility.queueSize();
			 break;
			 
		 case 6:
			 utility.queuedisplay();
			 break;
			 
		 case 7:
			 System.out.println("Enter Element");
			 int element1=utility.ReadIntegers();
			 utility.enqueueRear(element1);
			 break;
			 
		default:
			System.out.println("Invalid Choice");
		 }
	 }while(ch!=8);
}
}

