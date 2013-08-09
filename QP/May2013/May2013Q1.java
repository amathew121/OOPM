/*
 * Write a program to determine sum of the series: [10m]
 * 
 * 1 + 1/2 + 1/3 + ... + 1/n
 * 
 */


public class May2013Q2 {
	
	public static void main (String args[]) {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		System.out.println("Enter the value of n: ")
		int n = Integer.parseInt(br.readLine);
		double sum = 0.0;
		for(int i = 1 ; i <= n ; i++ )
		{
			sum = sum + 1/i;
		}
		System.out.println("The sum of the series is  " +sum);
	}
}

/*
 * Command:
 * 
 * javac May2013Q1.java
 * java May2013Q1 4 6 
 * 
 * Output:
 * 
 * Addition of the two numbers is 10
 */
