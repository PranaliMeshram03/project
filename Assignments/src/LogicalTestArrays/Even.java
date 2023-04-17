package LogicalTestArrays;

import java.util.Scanner;

public class Even {
	public static void FindEvenOdd( int [ ] a) {
		int evenCount=0 , oddCount=0;
		for(int i=0; i <a.length;i++) {
			if(a [ i]%2==0) {
				System.out.println(a[ i] +" is even number");
				evenCount++;
			} else {
				System.out.println(a[i] +" is odd number");
				oddCount++;
			}
		}
		System.out.println("even"+evenCount);
		System.out.println("odd"+oddCount);
	}
	

	public static void main(String[] args) {
		System.out.println("Enter arrays size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int  [ ] arr = new int [size];
		for(int i = 0;i<arr.length;i++) {
			arr[ i] = sc.nextInt();
		}
		Even.FindEvenOdd(arr);

	}

}
