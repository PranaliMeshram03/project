package constructorAssignments;

import java.util.Scanner;

public class Student_03 {
	// 3). Create default constructor assign new value to all variables. Write SOP I
	// am in default constructor
	int id;
	String name;
	double age;

	public Student_03() {
		System.out.println("I am default constructor");
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name ,age");
		int id = sc.nextInt();
		String name =sc.next();
		double age = sc.nextDouble();
		
		Student_03 s1 = new Student_03();
		s1.display();

	}

}
