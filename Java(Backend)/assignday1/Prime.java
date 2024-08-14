package Day2;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	    int temp=0;
	    for(int i=2;i<num/2;i++)
	    {
	   if(num%1==0){
	    temp++;
	    break;
	   }
	   }
	    if(temp==0 && num>1)
	    System.out.print(num+" is a prime number");
	    else
	    System.out.print(num+" is Not a Prime number");
	}

}
