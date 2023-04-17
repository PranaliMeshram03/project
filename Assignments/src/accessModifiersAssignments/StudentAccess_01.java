package accessModifiersAssignments;

public class StudentAccess_01 {
	// 1. Create a class Student with 4 variables called as rollNo, admissionNo,
	// age,
	// courseId. Each of the variables should have one of the access modifier:
	// public,
	// protected, no-access-modifier and private. Add 4 methods in the class: public
	// method doPublic, no access modifier method doDefault, protected method
	// doProtected, private method doPrivate.
	// a. In main method outside the class but in same package – create object of
	// type Student.

	public int rollNo = 101;

	protected double admissionNo = 4785;

	private int age = 22;
	double courseld;
	
	public void  dopublic() {
		System.out.println(" This is public");
	}
	
	public void doprotected() {
		System.out.println(" This is protected ");
	}
	
	public void  doprivate () {
		System.out.println(" This is private ");
	}
	

	public static void main(String[] args) {
		StudentAccess_01 s1 = new StudentAccess_01();
		
		System.out.println(s1.rollNo);
		s1.dopublic();
		
		System.out.println(s1.admissionNo );
		s1.doprotected();
		
		System.out.println(s1. age );
		s1.doprivate();

	}

}
