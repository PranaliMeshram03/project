package LogicalTestArrays;

import java.util.Scanner;

public class TotalCountEven {
	public  void FindEvenOdd(int [ ] arr) {
		int evencount =0 , oddcount=0;
		for(int i =0 ; i<arr.length;i++) {
			if( arr [ i] % 2 ==0) {
				
				System.out.print( arr[i] +  "even number");
				evencount++;
				
			} else {
				System.out.print( arr[i] +  "odd number");
				oddcount++;
			}
		}
		System.out.print(evencount);
		System.out.print( oddcount);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int a[ ] = new int [ size];
		System.out.println("Enter arrays elements");
		for(int i= 0; i <a.length;i++) {
			a [ i] = sc.nextInt();
		}
		 TotalCountEven t = new  TotalCountEven();
		 t.FindEvenOdd(a);
	}
}
