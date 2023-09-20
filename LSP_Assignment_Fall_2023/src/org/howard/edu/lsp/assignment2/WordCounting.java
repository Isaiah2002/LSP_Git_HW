package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class WordCounting 
{
	/**
	 * Isaiah Brundidge
	 * @param args
	 */

	public static void main(String[] args) 
	{
		FileReader filename = new FileReader(); //FileReader to read file
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); //creates and defines the structure of hashmap
		try 
		{
			String filepath = filename.readToString("main/java/resource/words.txt"); //obtains the file path to read
			System.out.println(filepath);
			String[] seperated = filepath.toLowerCase().split(" "); //makes all strings lower case and all spaces are now counted as a new element in an array
			for(int x = 0; x < seperated.length; x++) //Iterates the array
			{
				if(seperated[x].length() > 3) //checks if the words are 3 letters or more
				{
					if(hashmap.get(seperated[x]) == null)
					{
						hashmap.put(seperated[x], 1); //setting number of occurrences to 1
					}
					else
					{
						hashmap.put(seperated[x], hashmap.get(seperated[x]) + 1); //Increasing the occurrences 
					}
				}
			}
			for(String i : hashmap.keySet())
			{
				System.out.println(i + " " + hashmap.get(i)); //printing each hashmap key				
			}
		}
		catch(FileNotFoundException e) //catches the error
		{
			System.out.println("File is not found in directory");
		}
	}
}
