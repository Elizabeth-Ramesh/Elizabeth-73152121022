package day3;
//single inheritance
class twoWheeler{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bik extends twoWheeler{
	void brandName() {
		System.out.println("Brand name is honda");
	}
}
public class MyClass {
	public static void main(String[] args) {
		Bik bike=new Bik();
		bike.noOfWheels();
		bike.brandName();
	}

}
