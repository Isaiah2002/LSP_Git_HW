package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;

/**
 * 
 * @author Isaiah Brundidge
 *
 */
public class IntegerSet 
{
	private ArrayList<Integer> set = new ArrayList<Integer>(); //creating an arraylist called set
	
	/**
	 * Default constructor
	 */
	public IntegerSet() //auto generated when program is run
	{
		
	}
	
	/**
	 * Constructor if you want to pass in already initialized
	 * @param set is an arrylist
	 */
	public IntegerSet(ArrayList<Integer> set) 
	{
		this.set = set;
	}

	
	/**
	 * This adds a int to IntegerSet
	 * @param item to add to the IntegerSet
	 */
	public void add(int item) //adds a integer into the set
	{
		if(!set.contains(item)) //if the item isn't in the set (checks for duplicates)
		{
			set.add(item);
		}
	}
	
	/**
	 * Removes all the elements from the array
	 */
	public void clear() //removes everything from the set
	{
		set.clear(); //set still exists
	}
	
	/**
	 * @return returns the IntegerSet in string representation
	 */
	public String toString() //converts the integer type to string 
	{
		return set.toString();
	}
	
	/**
	 * @return returns a number of how many integers are in set
	 */
	public int length() // returns the length
	{
		return set.size();
	}
	
	/**
	 * 
	 * @param set2 is a second set named anotherSet
	 * @return true if both integerSets have the same size and elements otherwise false 
	 */
	public boolean equals(IntegerSet set2)
	{
		for(int i = 0; i < set.size(); i++)
		{
			if(!set2.contains(i)) //checks if the item is in the set2
			{
				return false;
			}
		}
		return true;

	}
	
	/**
	 * @param value is the individual element in the set
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value)
	{
		if(set.contains(value)) //if the value is in the set
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * @return returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	 */
	public int largest() 
	{
		int largest = set.get(0); //largest is the index of the frist item
		for (int i = 1; i < set.size(); i++) 
		{
			if(set.get(i) > largest)
			{
				largest = set.get(i);
			}
		}
		return largest;
	}
	
	/**
	 * @return returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 */
	public int smallest()
	{
		int smallest = set.get(0); //smallest is the index of the first item
        for (int i = 1; i < set.size(); i++) 
        { 
            if (set.get(i) < smallest) 
            { 
                smallest = set.get(i); 
            } 
        }
        return smallest;	
	}
	
	/**
	 * Removes an item from the set or does nothing if not there
	 * @param item is the individual item in the set
	 */
	public void remove(int item)
	{
		if(set.contains(item)) 
		{
			set.remove(item);
		}
	}
	
	/**
	 * Set union
	 * @param intSetb is another integer set
	 */
	public void union(IntegerSet intSetb) //combines both sets
	{
		for(int i = 0; i < set.size(); i++)
		{
			intSetb.add(set.get(i));
		}	
	}

	/**
	 * Set intersection, all elements in s1 and s2
	 * @param intSetb is another integer set
	 */
	public void intersect(IntegerSet intSetb) //gets the items that both sets have
	{
		for(int i = 0; i < set.size(); i++)
		{
			if(!intSetb.contains(i))
			{
				intSetb.remove(set.get(i));
			}
		}
	}
	
	/**
	 * Set difference, i.e., s1 – s2
	 * @param intSetb is another integer set
	 */
	public void diff(IntegerSet intSetb) // set difference, i.e. s1 - s2
	{
		for(int i = 0; i < set.size(); i++) 
		{
			for(int p = 0; p < set.size(); p++)
			{
				if(intSetb.contains(p) == set.contains(set.get(p)))
				{
					intSetb.remove(p);
				}
			}
		}
	}
	
	/**
	 * Set complement, all elements not in s1
	 * @param intSetb is another integer set
	 */
	public void complement(IntegerSet intSetb) 
	{
		for(int i = 0; i < set.size() + 1; i++)
		{
			if(set.contains(i) == intSetb.contains(i))
			{
				intSetb.remove(set.get(i));
			}
		}
	}
	/**
	 * @return returns true if the set is empty, false otherwise
	 */
	boolean isEmpty()
	{
		
		for(int i = 0; i < set.size(); i++)
		{
			if(set.contains(i))
			{
				return false;
			}
		}
		return true;		
	}
	
}
