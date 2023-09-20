package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;


public class FileReader 
{
	//will open a file and reads it's contents into a string 
	//and returns it to whoever called/uses it
	public FileReader()
	{
		//a constructor that instantiate/initialize the class
		System.out.println("My Constructor!!!");
	}
	public String readToString(String resource) throws FileNotFoundException  
	{
		//if a class is not found it'll throw the exception
		// TODO Auto-generated method stub
		URL url = getClass().getClassLoader().getResource("words.txt");
		if(url != null)
		{
			File file = new File(url.getPath()); 
			Scanner sc = null;
			try
			{
				//scanner is a class that when you feed it a file object 
				//it'll give a mechanism to put it into a string 
				sc = new Scanner(file);
				//will be reading lines
				String output = "";
				//ignores all the new lines and creates a giant string
				while(sc.hasNextLine())
				{
					//builds the giant string while reading line by line 
					//and putting a space between each word 
					output = output + sc.nextLine() + " ";		
				}
				//returns the giant string and deletes the last space of each line
				return output.trim();
			}
			finally
			{
				//closes the scanner 
				sc.close();
			}
		}
		throw new FileNotFoundException();
	}
}
