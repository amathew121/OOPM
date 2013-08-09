/*
 * Write a program to find sum of digits of a user entered number 
 * and print the sum. [10m]
 * 
 */

import java.io.*;

public class May2013Q3 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		System.out.println("Enter a number: ");
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		while (n != 0 ) 
		{
			sum = sum + n%10;
			n = n/10;
		}
		System.out.println("The sum of the digits is  " + sum);
	}
}

/*
 *  
 * Output:
 * 
 * Enter a number: 
 * 845 
 * The sum of the digits is  17 
 *
 */
