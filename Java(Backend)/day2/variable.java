package day2;
//type of variable
public class variable {
	int b=20; //instance variable
	static int c=30; //static or class variable
	public static void main(String[] args) {
		int a =10; //local variable
		System.out.println("Local Variable: "+a);
		
		variable obj =new variable();
		System.out.println(obj.b);
		
		
		System.out.println(variable.c);
	}
}

