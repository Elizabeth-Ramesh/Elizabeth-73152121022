package Day2;
import java.util.*;
public class Armstrong {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int arms=sc.nextInt();
	int temp=arms;
	int count=0,dig=0,a;
    while (arms != 0) {
	   arms /= 10;
	   ++count;
	}
    arms=temp;
    while(arms!=0) {
    	a=arms%10;
		dig+=Math.pow(a, count);
		arms=arms/10;
    }
    if(temp==dig) {
    	System.out.println("Amstrong Number");
    }
    else {
    	System.out.println("Not a Amstrong Number");
    }
}	
}
