package Test02;

public class DivisbleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 100; a++) {
		    if (a % 5 == 0) {
		       System.out.println(a / 5);
		    } else if (a % 10 == 0) {
		    	System.out.println(a / 10);
		    } else {
		    	System.out.println(a);
		    }
		}

	}

}
