package staticAssinments;

//9.	WAP to Show 3 use of final - final class, final variable and final method
final class Bank {
	int x = 30;

	final void dispaly() {
		System.out.println("bank are various branches");
		System.out.println("the value is :" + x);

	}
}

public class Final01 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.dispaly();
	}

}
