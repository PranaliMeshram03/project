 package LogicalTestArrays;
//8) There are four classes a) Car (carId, carcolor) b) Engine
//(engineid ,lastenginecleandate) c) SubEngine (subenginetype)
//d) Gear (type - auto manual)
//Car has Engine, Engine has SubEngine, Car also has Gear
//Create Object in Object (Containment) for above scenario [2M]

class car{
	int carld;
	String carcolour;
	
	car (int carld , String carcolour) {
		this.carld=carld;
		this.carcolour = carcolour;
	}
	public String toString() {
		return carld+" "+ carcolour;
	}
	class Engine{
		int engineid;
		int lastenginecleandate;
		Engine(int engineid , int lastenginecleandate){
			this.engineid=engineid;
			this.lastenginecleandate= lastenginecleandate;
		}
	
		public String toString() {
			return "Engine [engineid=" + engineid + ", lastenginecleandate=" + lastenginecleandate + "]";
		}
		
	}
	class SubEngine{
		String subenginetype;
		SubEngine(	String subenginetype){
			this.subenginetype=subenginetype;
		}
	
		public String toString1() {
			return "SubEngine [subenginetype=" + subenginetype + "]";
		}
		class Gear{
			String type_auto;
			Gear(String type_auto){
				this.type_auto=type_auto;
			}
		}
//		public String toString() {
//			String type_auto;
	//}
		
		}
	}

public class Car {

	public static void main(String[] args) {
		

	}

}
