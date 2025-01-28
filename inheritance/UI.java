package inheritance;

public class UI {

	public static void main(String[] args) {
	        Vehicle vr = new Vehicle();
	        vr.startEngine();
	        
	        Car c=new Car();
	        c.drive();
	        
	        ElectriCar e = new ElectriCar();
	        e.chargebattery();
	        
	        Bike b = new Bike();
	        b.kickStart();
	        b.startEngine();

	}

}
