package Asiignment01;

import java.util.Scanner;

public class FiveSubjectMarks_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a five subject marks");
		double marks,total,average,percentage ;
		double s1=sc.nextDouble();
		double s2=sc.nextDouble();
		double s3=sc.nextDouble();
		double s4=sc.nextDouble();
		double s5=sc.nextDouble();
		
		total= (s1+s2+s3+s4+s5);
		average= total/5;
		percentage = (total/500)*100;
		System.out.println("Total is:"+total);
		System.out.println("Average is:"+average);
		System.out.println("Percentage is:"+percentage);
	
		
	}

}
