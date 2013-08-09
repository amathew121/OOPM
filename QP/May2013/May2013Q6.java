/*
 * 
 * Write a program to count the occurrence of a given character in a 
 * given line of text e.g. if the line of text is “All the best”, and 
 * given character is ‘t’, the count of ‘t’ is 2. [10m]
 * 
 */

import java.io.*;

public class May2013Q6 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		
		System.out.println("Enter a string");
		String s = br.readLine();
		
		System.out.println("Enter the character you want to search");
		char key = br.readLine().charAt(0);
		
		char c[] = s.toCharArray();
		int count = 0;
		for ( int i = 0 ; i < s.length(); i ++)
		{
			if ( c[i] == key )
				count++;
		}
		System.out.println("The count of " + key + " is " + count);
	}
}

/*
 *  
 * Output:
 * 
 * Enter a string 
 * All the best 
 * Enter the character you want to search 
 * t 
 * The count of t is 2 
 * 
 */
