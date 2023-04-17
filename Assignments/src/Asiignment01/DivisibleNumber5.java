package Asiignment01;

import java.util.Scanner;

public class DivisibleNumber5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a divisible by 5 and 10");
		int num=sc.nextInt();
		if(num %5 == 0  && num % 10== 0)
		{
			
			System.out.println("Given number "+num+  "is Divisible by 5 and 10");
		}
		else
		{
			System.out.println("Given number" +num+ "is not Divisible by 5 and 10");
		}

	}

}
