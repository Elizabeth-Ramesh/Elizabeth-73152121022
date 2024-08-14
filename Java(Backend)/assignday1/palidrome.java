package Day2;
import java.util.*;
public class palidrome {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int a=num;
		int b,c=0;
		while(num>0) {
			b=num%10;
			c=c*10+b;
			num=num/10;
		}
		if(c==a) {
		System.out.println(a+" is a palindrome");
		}
		else {
			System.out.println(a+" is not a palindrome");
		}
		
	}

}
