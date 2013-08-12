public class PatternPascal {
	
	public static void main (String args[]) {
		int rows = 5;  
		int pascal[][] = new int[rows][rows];
		for(int n=0; n<rows; n++)
		{
		    for(int k=0; k<=n; k++)
	 	    {
	 	       if(k==0)
	 	       {pascal[n][k]=1;}
		 
		       else if(pascal[k]==pascal[n])
		       {pascal[n][k]=1;}
		 
		       else if(k>0)
		       {pascal[n][k] = pascal[n-1][k-1] + pascal[n-1][k];}
	 
		    }
		}
		for(int i = 1 ; i <= rows ; i++)
		{
			for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(pascal[i-1][k-1] + " ");
            }
			System.out.println();
		}
		
	}
}
