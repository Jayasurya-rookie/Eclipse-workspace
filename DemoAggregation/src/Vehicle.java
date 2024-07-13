
abstract class Vehicle {
	public void start() {
		System.out.println("vehicle start");
	}
	public void stop() {
		System.out.println("Vehicle stop");
	}
	public abstract void refuel();

}
class ElectricCar extends Vehicle{
	//@override
	public void refuel() {
		System.out.println("Charging with Electric");
	}
}

class PetrolCar extends Vehicle{
	//@override
	public void refuel() {
		System.out.println("refueling with petrol");
	}
}

class DieselCar extends Vehicle{
	//@override
	public void refuel() {
		System.out.println("refueling with Diesel");
	}
}
