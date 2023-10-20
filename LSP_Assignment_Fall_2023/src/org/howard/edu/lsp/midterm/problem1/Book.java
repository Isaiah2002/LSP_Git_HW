package org.howard.edu.lsp.midterm.problem1;

public class Book 
{

    private String title;
    private String author;
    private int year;
    
	public Book(String title, String author, int year) 
	{
        this.title = title;
        this.author = author;
        this.year = year;
    }
	
	public String toString() 
	{
        return title + ", " + author + ", " + year;
    }
	/*
	public String toString(String title, String author, int year)
	{
		return title + ", " + author + ", " + year;
	}
	*/
	
	public boolean equals(Object obj) 
	{
        if (this == obj)
        {
        	return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
        	return false;
        }
        
        Book other = (Book) obj;
        
        return this.title.equals(other.title) && this.author.equals(other.author);
    }
}
