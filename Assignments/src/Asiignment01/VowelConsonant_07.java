package Asiignment01;

import java.util.Scanner;

public class VowelConsonant_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		char ch;
		
		System.out.println("Enter a character:");
		ch = sc.next().charAt(0);
		
		
		switch (ch) 
		{
		case 'a':
			System.out.println("Vowle");
			break;
		case 'e':
			System.out.println("Vowle");
			break;
		case 'i':
			System.out.println("Vowle");
			break;
		case 'o':
			System.out.println("Vowle");
			break;
		case 'u':
			System.out.println("Vowle");
			break;

		case 'A':
			System.out.println("Vowle");
			break;
		case 'E':
			System.out.println("Vowle");
			break;
		case 'I':
			System.out.println("Vowle");
			break;
		case 'O':
			System.out.println("Vowle");
			break;
		case 'U':
			System.out.println("Vowle");
			break;
		default:
			System.out.println("Consonant");

		}
		System.out.println("Done"); 
		


	}

}
