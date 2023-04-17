package Test02;

import java.util.Scanner;

public class Trimorphic_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int digit = sc.nextInt();
		
		int cube;

		cube = digit * digit * digit;

		if (digit % 10 == cube % 10) {
			System.out.println(cube+" ");
			System.out.println("The number is Trimorphic");

		} else { 
			System.out.println("The number is  not Trimorphic");

		}

	}

}
