package loopAssinments;

import java.util.Scanner;

public class SumOfEvenNumber_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	 Write a program to find sum of all even numbers between 1 to n. 
		
		int num,sum=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a numer");
		num =sc.nextInt();
		for(i=0;i<num;i++){
			if(i%2==0){
				sum =sum+i;
				System.out.println("The sum of number is:"+num+ "=" +sum);
			}
			
		}

	}

}
