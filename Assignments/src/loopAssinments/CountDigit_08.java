package loopAssinments;

import java.util.Scanner;

public class CountDigit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8.	 Write a program to count number of digits in any number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
	int	n= sc.nextInt();      
		
		int i=0;
		
		while(n!=0){       //while loop
			n=n/10;
			i++;
		}
		System.out.println("Number of digit:"+i); 
		
	
	/*	for(i=0;i<=n;i++){              //for loop
			n=n/10;
			System.out.println("Number of digit:"+i);
		}  */
		
		
		

	}

}
