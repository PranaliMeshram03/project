package loopAssinments;

import java.util.Scanner;

public class Automorphic_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//18.	WAP to check given no is automorphic or not
		  // input n=25
			//	   output Automorphic
			//	 as 25*25=625

		
		
		 int n, sq, i,sqrNumRemainder,c = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number=");
	        n = sc.nextInt();
	        i=n;        
	        sq = n * n;
	        while (i > 0)
	        {
	            i=i/10;
	            c++;
	        }
	     
	        sqrNumRemainder= sq%(int)Math.pow(10, c);
	        if(sqrNumRemainder==n)
	        {
	            System.out.println("Automorphic Number");
	        }
	        else
	        {
	            System.out.println("Not Automorphic Number");
	        }

	}

}
