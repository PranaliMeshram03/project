package AssignmentTest;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int n=100,cout;
	 
	for(int i=500; n>=i; i--){
		cout=0;
		for(int k=2; k<=i/2; k++){
			if(i%k==0);
			cout =1;
			break;
		}
		if(cout==0){
			System.out.println(i);
		}
	}
	
	}

}
