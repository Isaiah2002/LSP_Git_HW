package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;


public class Driver 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader();
		try 
		{
			//opens the text file and opens the contents
			System.out.println(fr.readToString("main/java/resource/words.text"));
		} 
		catch (FileNotFoundException e) 
		{
			//if the exception occurs then this block will run
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
}
