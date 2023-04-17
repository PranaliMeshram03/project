package AssignmentTest;

import java.util.Scanner;

public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length");
		double length = sc.nextDouble();
		System.out.println("Enter a beradth");
		double beradth = sc.nextDouble();

		// double length = 7.5, beradth = 5.5 , perimeter;

		double perimeter = 2 * (length + beradth);

		System.out.println("The perimeter of rectangle is " + perimeter);

	}

}
