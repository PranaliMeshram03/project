package staticAssinments;

public class Car_01 {

	// 1. Create a class Car with String model and inttotalCarSold as static
	// variable in main() method.

	static int model = 2;
	double inttotalCarSold = 25;

	public void carData() {
		System.out.println(model);
		System.out.println(inttotalCarSold);

	}

	public static void main(String[] args) {
		Car_01 c = new Car_01();
		c.carData();

	}

}
