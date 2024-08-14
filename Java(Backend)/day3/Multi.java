package day3;
//multilevel inheritence
class vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class twoWheel extends vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class scooty extends twoWheel{
	void brandName() {
		System.out.println("Brand name is Activa");
	}
}
//heirarchical inheritance
class bike extends twoWheel{
	void brandName() {
		System.out.println("Brand name is honda");
	}
}
public class Multi {
	public static void main(String[] args) {
		scooty vehi=new scooty();
		vehi.noOfEngine();
		vehi.noOfWheels();
		vehi.brandName();
		
		bike Bike=new bike();
		Bike.noOfEngine();
		Bike.noOfWheels();
		Bike.brandName();
	}

}
