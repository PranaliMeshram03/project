package OopsTest;
class Animal {
	String name = "animal";

	String makeNoise() {
		return "generic noise";
	}
}

class Dog extends Animal {
	String name ;

	String show() {
		return name;
	}
}

public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog();
		System.out.println(a.show());

	}

}

