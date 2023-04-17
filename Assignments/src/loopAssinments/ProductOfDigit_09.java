package loopAssinments;

import java.util.Scanner;

public class ProductOfDigit_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		 int i=4;
		int a = input.nextInt();
		while(i<=a){
			
			i++;
			System.out.println(i+ "*" + a+ "=" +i*a);
			
		} 
		
		
		

	}

}
