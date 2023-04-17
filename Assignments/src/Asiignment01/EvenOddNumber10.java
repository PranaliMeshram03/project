package Asiignment01;

import java.util.Scanner;

public class EvenOddNumber10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int a = sc.nextInt();
		if (a > 0) {
			if (a % 2 == 0)
				System.out.println("even number");
			// System.out.println(" number is positive ");
			else
				System.out.println("odd number");
		} else
			System.out
					.println("it is a negetive number....please enter a postive number");
	}

}
