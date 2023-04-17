package loopAssinments;

import java.util.Scanner;

public class PrimeNumber_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	Find all prime number between 400 to 300;
		
		Scanner sc = new Scanner(System.in);
	int a=300,b=400;
	for(;a>=b;a++)
	{
	 int count =0;
	 for(int j=1;j<=a;j++)
	 {
		 if(a%j==0)
			 count++;
	 }
	 if(count==2)
		 System.out.println(a);
			 
		 	 
	}
	}

}
