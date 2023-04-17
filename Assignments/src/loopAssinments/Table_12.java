package loopAssinments;

import java.util.Scanner;

public class Table_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
	int	a = input.nextInt();
		for(int i=1; i<=20; i++)
		{
			System.out.println(i+ " *"+a+ "= "+i*a);
		}

	}

}
