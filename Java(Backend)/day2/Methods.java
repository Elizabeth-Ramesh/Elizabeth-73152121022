package day2;
//type of methods
public class Methods {
	void myMethod1() {
		System.out.println("Instance variable");
	}
	
	static void myMethod2() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		Methods obj =new Methods();
		obj.myMethod1();
		
		Methods.myMethod2();
		
	}

}
