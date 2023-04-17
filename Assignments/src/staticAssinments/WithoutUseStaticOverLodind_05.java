package staticAssinments;

class counter{
	int count =1;
	counter(){
		count++;
		System.out.println(count);
		
	}
}

public class WithoutUseStaticOverLodind_05 {

	public static void main(String[] args) {
	counter c = new counter();
	counter c1 = new counter();
	counter c2 = new counter();

	}

}
