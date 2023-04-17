package Test02;

import java.util.Scanner;

public class Series_11 {
	public static int nthTerm (int n) {
		return (n*n)+(n*n*n);
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(nthTerm (n));
		
		}
		}

	


