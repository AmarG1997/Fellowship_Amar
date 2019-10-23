package com.blabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedList {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter word you want to search");
    	String word=sc.nextLine();
    	UnsortedLIst list=new UnsortedLIst(); //initializing new link list 
    	String line = null;
  
    	try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =  new FileReader("/home/admin1/Documents/a.txt");//giving path to read file

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader); //reading text from file

            while((line = bufferedReader.readLine()) != null) //storing words in string named as line
            {
         	 String [] s=line.split(" ");
         	 for(String w:s)
         	 {
         
         		 list.push(w);
         	 }
         	 }
            bufferedReader.close();

           
int n=list.searchWord(list.head,word);
if(n>=0)			//if word is found at some position
{
	System.out.println("word  is found in file ");
	System.out.println("word  is deleted from linkedlist and file *");


	list.deleteNode(n);
	list.printList();
}

//if word is not found 
else 
	{
	System.out.println("word  is not found in file");
	System.out.println("new word is added  in file");
	

	list.push(word);
	list.printList();

	}
 
            File file = new File("/home/admin1/Documents/a.txt");   // Step #2. Create a file writer object with above file

            FileWriter fileWriter = new FileWriter(file);            // Step #3. Create a file object with above file writer.

             	 BufferedWriter writer = new BufferedWriter(fileWriter);

           // Step #4. Prepare data to be stored in above file
             	 String str=list.toString();

          // Step #5. Perform write operation.
    writer.write(str);
    writer.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file " );                
        }
        catch(IOException ex) {
            System.out.println("Error reading file");                  
//catch if file is not found            
            }
    	



    }


}

