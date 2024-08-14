package day2;
// constructor overloading in java
public class constructorOverloading {
	/*constructorOverloading(String name) {
		System.out.println("Welcome "+name); 
	 }
	  constructorOverloading(int a,int b) {
		 System.out.println(a+b);
	 }
	  constructorOverloading(int n) {
		 System.out.println(n);
	 }
	 public static void main(String [] args) {
		 constructorOverloading obj1 = new constructorOverloading("Eliza");
		 constructorOverloading obj2 = new constructorOverloading(10,20);
		 constructorOverloading obj3 = new constructorOverloading(5);
	 }*/
	//two values;
	constructorOverloading(String name) {
		this(10,20);
		System.out.println("Welcome "+name); 
	 }
	  constructorOverloading(int a,int b) {
		  this(5);
		 System.out.println(a+b);
	 }
	  constructorOverloading(int n) {
		 System.out.println(n);
	 }
	 public static void main(String [] args) {
		 constructorOverloading obj1 = new constructorOverloading("Eliza");
	 }
}
