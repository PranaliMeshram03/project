package constructorAssignments;

public class AccountClass_02 {
	
	//. In main, create a new object of the Account class and print the member variables value.
	//Note – Default constructor is provided by Java to facilitate the creation of a new object.
	//Here variables are assigned default values
	
	String firstname;
	String secondname;
	int age;
	public  AccountClass_02(String fn, String sn,int a){
		firstname=fn;
		secondname=sn;
		age=a;
		
	}
	
	public void display() {
		System.out.println(firstname+" "+secondname+" "+age);
	}
	


	public static void main(String[] args) {
		AccountClass_02 a =new AccountClass_02("kirti","sonali",25);
		a.display();

	}

}
