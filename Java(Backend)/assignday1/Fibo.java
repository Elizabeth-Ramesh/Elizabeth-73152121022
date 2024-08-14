package Day2;
import java.util.*;
public class Fibo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fibo=sc.nextInt();
		int num1=0;
		int num2=1;
		System.out.print(num1+" ");
		System.out.print(num2);
		int num3;
		for(int i=2;i<fibo;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}

}
