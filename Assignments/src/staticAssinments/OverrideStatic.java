package staticAssinments;
class Base{
	public static void display() {
		System.out.println("static or  class method is base ");
	}
	public void print()  {
        System.out.println("Non-static or Instance method from Base");
   }
}
class  Derived extends Base{
	public static  void display() {
		System.out.println("static or class method derived");
	}
	public void print()  {
        System.out.println("Non-static or Instance method from Base");
   }
}

public class OverrideStatic {

	public static void main(String[] args) {
	Base b= new 	 Derived ();
	b.print();
	b.display();

	}

}
