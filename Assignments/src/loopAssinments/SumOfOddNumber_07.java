package loopAssinments;

import java.util.Scanner;

public class SumOfOddNumber_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to find sum of all odd numbers between 1 to n.

		int num, sum = 0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer");
		num = sc.nextInt();
		for (i = 1; i < num; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
				System.out.println("The sum of number is:" + num + "=" + sum);
			}

		}
	}
}
	


