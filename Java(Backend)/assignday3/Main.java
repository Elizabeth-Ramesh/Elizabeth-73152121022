package assignday3;
class Animal{
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}
class cat extends Animal{
	void makeSound(){
		System.out.println("Bark");
	}
	
}
public class Main {

	public static void main(String [] args) {

		cat c=new cat();
		Animal a=new Animal();
		a.makeSound();
		c.makeSound();

	    }
}
