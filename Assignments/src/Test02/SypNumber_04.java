package Test02;

import java.util.Scanner;

public class SypNumber_04 {

	public static void main(String[] args) {
	//	4)write a java program to check given number is spy number or not
//	e.g 123 if sum of digit is equals to product of digit the number is spy       number
//	i.e 123=1+2+3=6 and 1*2*3=6 so the number is spy  number

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int product =1,sum=0,digit;
		
		
		
			while(n>0)
			{
				digit =n%10;
				sum=sum+digit;
				product =product*digit;
				n=n/10;
		
			}
			if(sum==product)
				System.out.println("is a spy number");
			
			else
				System.out.println("is not spy number");
				
		}

	}


