package day2;
// method overloading in java
public class methodOverloading {
	 void myMethod(String name) {
		System.out.println("Welcome "+name); 
	 }
	 void myMethod(int a,int b) {
		 System.out.println(a+b);
	 }
	 void myMethod(int n) {
		 System.out.println(n);
	 }
	 public static void main(String [] args) {
		 methodOverloading obj = new methodOverloading();
	     obj.myMethod(5);
	     obj.myMethod("Eliza");
	     obj.myMethod(10, 20);
	 }

}
