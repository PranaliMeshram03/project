package Asiignment01;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a>b && a>c){
			System.out.println("largest number is:" +a);
		}
		else if(b>a && c>b)
		{
			System.out.println("largest number is:" +b);
		}
		else
		{
			System.out.println("largest number is:" + c);
		}

	}

}
