package staticAssinments;
class Animal{
	static String name= "Dog";
 static void display() {
		System.out.println("Dog colour is beutiful");
	}
}
class Dog extends Animal{
static void display() {
	System.out.println("Dog eatting bread.....");
	
}
}
class Play extends Animal{
	static void display() {
		System.out.println("Dog play with ball");
	}
}

public class Que8 {

	public static void main(String[] args) {
		 Dog d = new  Dog();
		 d.display();
		 Play  p = new  Play ();
		 p.display();
		 

	}

}
