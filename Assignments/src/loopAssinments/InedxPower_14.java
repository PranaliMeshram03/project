package loopAssinments;

public class InedxPower_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base = 3, exponent = 4;

	    int power = 1;

	    while (exponent != 0) {
	      power *= base;
	    	
	      --exponent;
	    }

	  System.out.println("Answer = " + power);
	
	

	}

}
