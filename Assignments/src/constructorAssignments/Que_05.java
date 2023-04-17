package constructorAssignments;

public class Que_05 {
//	Define a constructor which takes all arguments and assigns those values to the member
//	variables. SOP I am in parameterized constructor
	String studentName;
	int studentAge;
	//constructor
	Que_05(String name, int age){
	studentName = name;
	studentAge = age;
	}
	
	void display(){
	System.out.println(studentName+ " "+studentAge);
	System.out.println("I am in parameterized constructor");
	}


	public static void main(String[] args) {

		 Que_05 myObj = new  Que_05("Manan" , 19);
		myObj.display();
		

	}

}
