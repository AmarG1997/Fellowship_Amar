package com.blabz.datastructure;

import com.blabz.Utility.Utility;

public class Cashcounter {

	static long balance = 10000;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter number of people");
		int people = utility.ReadIntegers();

		int ch;
		for (int i = 0; i < people; i++) {
			Utility.enqueueFront(i);
		}
		do {

			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			ch = utility.ReadIntegers();

			switch (ch) {
			case 1:
				System.out.println("Enter Amount");
				long amount = utility.ReadIntegers();
				utility.dequeueFront();
				balance = utility.deposit(amount, balance);
				break;

			case 2:
				System.out.println("Enter Amount");
				long amount1 = utility.ReadIntegers();
				utility.dequeueFront();
				balance=utility.withdraw(amount1, balance);

				break;

			default:
				System.out.println("Invalid choice");
				break;

			}
		} while (ch != 3);

	}
}
