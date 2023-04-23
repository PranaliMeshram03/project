package Mock;

import java.util.Scanner;

public class Student {
	
	String name;
	int age;
	String  address;
	
	public void set_Info (String name, int age) {
		this.name=name;
		this.age=age;
		}
	public void set_Info( String address) {
		this.address=address;
		
	}
	void display() {
		System.out.println(name + " "+ age+" "+address);
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student name");
		String name =sc.next();
		
		System.out.println("Enter the Student age");
		int age = sc.nextInt();
		
		System.out.println("Enter the Student address");
		String address = sc.next();
		
		
		 s.set_Info(name, age);
	     s.set_Info(address);
	     s.display();
		
	
	

	}

}
