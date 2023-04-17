package staticAssinments;

import java.util.Scanner;

public class Car_03 {

	// 3. Create two object of Car class and change value of static variable by 1st
	// object and print it by accessing 2nd object.

	static String cname;
	String cmodelName;
	double cprice;
	Car_03(String cn, String cN, double cp){
		cname= cn;
		cmodelName= cN;
		cprice=cp;
	}

	public void carData() {
		System.out.println(cname + " " + cmodelName + " " + cprice);
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter a cname");
		String cname = sc.next();
		System.out.println("Enter a cmodelName");
		String cmodelName = sc.next();
		System.out.println("Enter a cprice");
		double cprice = sc.nextDouble();
		Car_03 c = new Car_03(cname,cmodelName,cprice);
		
		c.carData();
		
		
	}

}
