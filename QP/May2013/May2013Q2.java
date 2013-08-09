/*
 * Write a program to determine sum of the series: [10m]
 * 
 * 1 + 1/2 + 1/3 + ... + 1/n
 * 
 */

import java.io.*;

public class May2013Q2 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		System.out.println("Enter the value of n: ");
		int n = Integer.parseInt(br.readLine());
		double sum = 0.0;
		for(int i = 1 ; i <= n ; i++ )
		{
			double div = (double) 1/i;
			sum = sum + div;
		}
		System.out.println("The sum of the series is  " + sum);
	}
}

/*
 *  
 * Output:
 * 
 * Enter the value of n: 
 * 6
 * The sum of the series is  2.4499999999999997
 *
 */
