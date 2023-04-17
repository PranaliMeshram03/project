package staticAssinments;

class Student {
	static int rollno;
	String name;

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	public void display() {
		System.out.println(rollno + " " + name);
	}
}

public class Que_04a {

	public static void main(String[] args) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		Student s3 = new Student(333, "Sonoo");

		s1.display();
		s2.display();
		s3.display();

	}

}
