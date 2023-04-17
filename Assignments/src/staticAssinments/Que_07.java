package staticAssinments;



class Mobile {
static 	String memorySize = "10GB";
}

class Apple extends Mobile {
	 static String camera = "13px";
}

class IPhone extends Apple {
static 	String name = "iphone14pro";

	static void showDetails() {
		System.out.println(memorySize + " " + camera + " " + name);
	}
}

public class Que_07 {

	public static void main(String[] args) {

		IPhone p = new IPhone();
		p.showDetails();
	}

}
