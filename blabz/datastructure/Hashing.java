package com.blabz.datastructure;

import com.bridgelabz.utility.Utility2;

public class Hashing {
	@SuppressWarnings({ "static-access" })
	public static void main(String[] args) throws Exception {
		Utility2 utility=new Utility2();
		int size;
		System.out.println("Enter the size of hash table");
		size = utility.ReadIntegers();
		Utility2 table[] = new Utility2[size];
		
		String path="/home/admin1/Documents/a1.txt";
		String[] filedata= utility.readFile(path);


		for (int j = 0; j < filedata.length; j++)
		{
			utility.addToHashTable(table, Integer.parseInt(filedata[j]));
		}
		System.out.println("Enter number to be searched");
		int searchkey = utility.ReadIntegers();
		utility.addToHashTable(table, searchkey);

		for (int j = 0; j < 11; j++)
		{
			System.out.println();
			try {
				
				table[j].display();
			}
			catch (Exception e) {
				System.out.print("null");
			}
		}
		for(int i=0;i<11;i++)
		{ 
			try {
				int size1 = table[i].size();
				for(int j=0;j<size1;j++)
				{
				utility.addOrdered((int)table[i].pop());
	}
			}
			catch(Exception e)
			{
				continue;
			}
		}
		System.out.println();
		utility.writeIntoFile(path);
		 

	}

	

}