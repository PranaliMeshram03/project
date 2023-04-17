package constructorAssignments;

import java.util.Scanner;

public class SubCourse_09 {
	// Create Course class with id and name. Course also contains SubCourse object
	// which is a
	// class containing subCourseId, subCourseName. Create default constructor for
	// both and see
	// each object and object constructor being called one by one. First SubCourse
	// constructor should be called

	int id;
	String name;
	String SubjectCourseName;
	
	public SubCourse_09(int id, String name,String SubjectCourseName) {
		this.id= id;
		this.name= name;
		this.SubjectCourseName =SubjectCourseName;
	}

	void display() {
		System.out.println(id + " " + name + " " + SubjectCourseName);
	}

	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name ,SubjectCourseName");
		int id = sc.nextInt();
		String name = sc.next();
		String SubjectCourseName = sc.next();*/
		
		SubCourse_09 s = new SubCourse_09(1,"panu" ,"java");
		s.display();
	}

}
