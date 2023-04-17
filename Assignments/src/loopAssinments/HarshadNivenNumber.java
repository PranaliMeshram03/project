package loopAssinments;

import java.util.Scanner;

public class HarshadNivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Harshad Number Or Niven Number
		// An harshad number is an integer number divisible by sum of its digit
		// Eg 18 sum=9 and 18 is divisible by 9

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int sum = 0, end = 0, i;
        int tepm=n;
		while (n != 0)

		{
			end = n % 10;

			sum = sum + end;

			n = n / 10;
			
		}
		if (tepm % sum == 0) {
			System.out.println(tepm + " is a Harshad number");
		} else {
			System.out.println(tepm + " is not a Harshad number");
		}

	}

}
