package staticAssinments;

public class StaticVarible02 {
	//2.	Change the value of variable by class name then Print it.
	
	static int x = 20;
	int y=x;
	
	public void  display() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		StaticVarible02  s = new StaticVarible02 ();
		s.display();

	}

}
