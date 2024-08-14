package assignday3;
class Vehiclen{
	void drive() {
		System.out.println("I like Car");
	}
}
class car extends Vehiclen{
	void drive() {
		System.out.println("Brand of the car is Toyato");
	}
}
public class Vehicle {
	public static void main(String[]args) {
		Vehiclen obj=new Vehiclen();
		car obj2=new car();
		obj.drive();
		obj2.drive();
	}

}
