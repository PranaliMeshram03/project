package constructorAssignments;

import java.util.Scanner;

public class Account_07 {
//	7. In main method, create 2 Account objects with different account numbers and names.
//	Then print the values of all the member variables of both the accounts.

	long accountNo;
	String customerName;
	double balance;
	public Account_07(long a_no, String CN,double B) {
		accountNo = a_no;
		customerName = CN;
		 balance =B;

	}

	
	void display() {
		System.out.println(accountNo + " " + customerName+" "+balance);
	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the accountNo,customerName,balance");
		long accountNo =sc.nextLong();
		String customerName = sc.next();
		double balance = sc.nextDouble();*/
		Account_07 a1 = new Account_07(124565, "Rita",5000.5);
		Account_07 a2 = new Account_07(785414, "Vihan",40000.8);
		a1.display();
		a2.display();

	}

}
