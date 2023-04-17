package loopAssinments;

import java.util.Scanner;

public class OrignalRevers_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//17.	WAP to check given no is palindrome or not. Original =Reverse
	//	Eg 1221
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n, r=1221;
		n = input.nextInt();
		while (n!=0){
			r=n%10;
			n=n/10;
		
			System.out.print(r);
		}


	}

}
