package piit.oopm.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringManipulation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
		
		String str1,str2,str3;
		
		System.out.println("Enter a String");
		str1 = bf.readLine();
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.charAt(3));
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.isEmpty());
		System.out.println(str1.substring(3, 5));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toLowerCase());
		
	}

}
