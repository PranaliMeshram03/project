package Test02;

import java.util.Scanner;

public class Que_12 {

	public static void main(String[] args) {
	//	WAP to print number from 1 to 50 if number is even then print as it is and number is odd then print negative number with its square


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		 int num =sc.nextInt();
		 if (num > 0) {
	            System.out.println("Positive number");
	        }
	        else if (num == 0) {
	            System.out.println("Zero");
	        }
	        else {
	            System.out.println("Negative number");
	        }
	 
	        // Checking for odd and even
	        if (num % 2 == 0) {
	            System.out.println(num + " is Even");
	        }
	        else {
	            System.out.println(num + " is Odd");
	        }

	}

}
