package Mock;
class CarInsurance {
	int car_dd;
	int car_mm;
	int car_yyy;
	

public CarInsurance(int car_dd, int car_mm, int car_yyy) {
		
		this.car_dd = car_dd;
		this.car_mm = car_mm;
		this.car_yyy = car_yyy;
	}

public String toString() {
	return car_dd+" "+ car_mm+" "+car_yyy;
}
 class Car{
	 String car_name;
		String car_colour;
		double car_price;
		 CarInsurance car_in;
		

		public  Car(String car_name, String car_colour, double car_price ,  CarInsurance car_in) {
			this.car_name = car_name;
			this.car_colour = car_colour;
			this.car_price = car_price;
			this.car_in= car_in;
		}
		public String toString() {
			return car_name +" "+car_colour+" "+car_price+" "+car_in;
		}
 }
}
public class Car {

	public Car(String string, String string2, int i, CarInsurance carInsurance) {
		
	}

	public static void main(String[] args) {
		Car BMW= new Car("BMW","Red", 54325, new CarInsurance(16,04,2023));
		System.out.println(BMW);

	}

}
