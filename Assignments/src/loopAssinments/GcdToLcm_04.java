package loopAssinments;

import java.util.Scanner;

public class GcdToLcm_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b,gcd=1,lcm;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the First Number: ");  
		a = sc.nextInt();     
		System.out.print("Enter the Second Number: ");  
		b = sc.nextInt();  
	//	gcd = gcd(a, b);  
		lcm =(a*b)/gcd;
		System.out.println("GCD of " + a + " and " + b + " =  " + gcd);  
		System.out.println("The LCM is:" +a+ " and " +b+ " = " + lcm);
		}    
	
}


	


