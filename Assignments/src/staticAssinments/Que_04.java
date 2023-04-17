package staticAssinments;

public class Que_04 {
	// 4. Check following variations:
	// a. Static variable and Non-Static (Instance Variable) – Just declare and
	// print it.
	// b. See if you can access static variable in static method
	// c. non static variable in static method
	// d. then static variable in non-static method
	// e. non static variable in non-static method Note: non static means instance
	// variable

	static int x = 400;
	int y = 150;

	public void change() {
		int x = 500;
		System.out.println(x);
		System.out.println("static varible");
		System.out.println(" non static varible");
	}

	public static void main(String[] args) {
		System.out.println(x);
		Que_04 q = new Que_04();

		q.change();

	}

}
