package loopAssinments;

import java.util.Scanner;

public class Factorial_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 16. WAP to check given no is Krishnamurthy or not
		// eg) 153=1!+5!+3!=153

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();

		int sum = 0, fact = 1, i;

		for (i = 1; i <= n; i++) {
			fact = fact * i;
			sum += fact;

		//	System.out.println(" " + fact + "=" + sum);
			 if(n % sum == 0)
	            {
	                System.out.println(n+" is a  Krishnamurthy ");
	            }
	            else
	            {
	                System.out.println(n+" is not a  Krishnamurthy number");
	            }

		}

	}

}
