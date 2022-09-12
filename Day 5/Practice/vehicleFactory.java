
public class vehicleFactory {
	public static vehicle getInstance(String type,int wheel) {
		if(type=="car") {
			return new Car(wheel);
		}
		else if(type=="bike") {
			return new Bike(wheel);
		}
		else {
			return new Bus(wheel);
		}
}
}
