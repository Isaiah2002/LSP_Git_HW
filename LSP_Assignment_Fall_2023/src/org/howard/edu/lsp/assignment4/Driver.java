package org.howard.edu.lsp.assignment4;

/**
 * 
 * @author Isaiah Brundidge
 * @version 10/16/2023
 */
public class Driver 
{
	/**
	 * 
	 * @param shows that the code works
	 */
	public static void main(String[] args) 
	{
		IntegerSet integerSet = new IntegerSet(); //creates integerSet from the class for a set of integers
		
		integerSet.add(1);
		integerSet.add(1);
		integerSet.add(2);
		
		System.out.println("Result of add: " + integerSet.toString());
		
		integerSet.clear();
		
		System.out.println("Result of clear: " + integerSet.toString());
		System.out.println("Result of rather the set is empty: " + integerSet.isEmpty());
		
		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(3);
		
		System.out.println("Result of intgerSet length: " + integerSet.length());
		
		IntegerSet setb = new IntegerSet();
		setb.add(1);
		setb.add(4);
		setb.add(3);
		boolean result = integerSet.equals(setb);
		
		System.out.println("Result if the the two sets are equal: " + result);
		
		
		System.out.println("Result if the value is in integerSet: " + integerSet.contains(3));
		
		System.out.println("Result of the greatest item in integerSet: " + integerSet.largest());
		System.out.println("Result of the smallest item in integerSet: " + integerSet.smallest());
		
		integerSet.remove(2);
		
		System.out.println("Result of the a item being removed: " + integerSet.toString());
		
		IntegerSet setc = new IntegerSet();
		setc.add(2);
		setc.add(4);
		setc.add(6);
		
		integerSet.union(setc);
		
		System.out.println("Result of two sets in union: "  + setc.toString());
		
		integerSet.intersect(setb);
		
		System.out.println("Result of two sets intersecting: "  + setb.toString());

		integerSet.diff(setc);
		
		System.out.println("Result of the difference between two sets: " + setc.toString());
		
		System.out.println("Result of rather the set is empty: " + integerSet.isEmpty());
		
		IntegerSet setd = new IntegerSet();
		setd.add(1);
		setd.add(3);
		setd.add(5);
		
		integerSet.complement(setd);
		
		System.out.println("Result of the complement between two sets: " + setc.toString());
		
		
		
		
		
		
		

	}

}
