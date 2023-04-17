package loopAssinments;

import java.util.Scanner;

public class FactoNumber_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//15.	 1!+2!+3!.........+n! find s
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		
		int n,sum=0,fact=1,i;
		n = sc.nextInt();
		
		for( i=1;i<=n;i++)  {
			fact =fact*i;
			sum+=fact;
			
			System.out.println(" " + fact+"="  +sum);
			
		}

	}

}
