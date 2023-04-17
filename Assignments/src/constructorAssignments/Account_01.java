package constructorAssignments;

import java.util.Scanner;

public class Account_01 {
	// Create a class Account with member Variable: long accountNo, String
	// customerName. Make them public.

	long accountNo;
	String customerName;

	public Account_01(long a_no, String CN) {
		accountNo = a_no;
		customerName = CN;

	}

	public void display() {
		System.out.println(accountNo + " " + customerName);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account_01 a = new Account_01(1245635, "Ragini");
		
		

		a.display();
	}

}
