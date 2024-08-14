package Day2;
import java.util.*;
public class Fact {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int fact=1;
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact+" is factorial of "+num);
	}

}
