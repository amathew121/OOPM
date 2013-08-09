/*
 * Write a program to find transpose of a matrix, and print the transposed matrix. [5] 
 * 
 * 				 [1 2] 								[1 3 5]
 * If matrix A = |3 4| , then the transpose of A =  [2 4 6]
 * 				 [5 6]
 */

import java.io.*;

public class May2013Q4 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		System.out.println("Enter no of rows for matrix A: ");
		int m = Integer.parseInt(br.readLine());
		System.out.println("Enter no of columns for matrix A: ");
		int n = Integer.parseInt(br.readLine());
		
		int a[][] = new int[m][n];
		System.out.println("Enter the values for matrix A: ");
		for (int i = 0 ; i < m ; i++)
			for (int j = 0 ; j < n ; j++)
				a[i][j] = Integer.parseInt(br.readLine());
		
		int at[][] = new int[n][m];
		for (int i = 0 ; i < m ; i++)
			for (int j = 0 ; j < n ; j++) 
				at[j][i] = a[i][j];

		System.out.println("Transposed Matrix is ");
		for (int i = 0 ; i < n ; i++)
		{
			for (int j = 0 ; j < m ; j++)
				System.out.print(at[i][j]+" ");
			System.out.println();
		}
	}
}

/*
 *  
 * Output:
 * 
 * Enter no of rows for matrix A: 
 * 3 
 * Enter no of columns for matrix A:  
 * 2 
 * Enter the values for matrix A:  
 * 1 
 * 2 
 * 3 
 * 4 
 * 5 
 * 6 
 * Transposed Matrix is  
 * 1 3 5  
 * 2 4 6 
 *
 */
