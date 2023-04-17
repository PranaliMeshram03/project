package Asiignment01;

import java.util.Scanner;

public class LeapYear04 {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a years");
		int year=sc.nextInt();
		 boolean leap ;
		 
		 if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) 
		 {
		      System.out.println(year + " is a leap year.");
		    } 
		 else 
		    {
		      System.out.println(year + " is not a leap year.");
		    }
		
	}

}
