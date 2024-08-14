package day3;
class A{
	int a=10;
	A(String name){
		System.out.println("Welcime "+name);
	}
	void myMethod1() {
		System.out.println("I am a super class method");
	}
}
class B extends A{
	B(){
		super("Eliza");
	}
	void myMethod2() {
		System.out.println("super class variable "+super.a);
		super.myMethod1();
	}
}
public class Super {
	public static void main(String[] args){
		B b=new B();
		b.myMethod2();
	}
}