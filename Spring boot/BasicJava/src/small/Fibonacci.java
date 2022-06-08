package small;
import java.util.*;

public class Fibonacci {
public static void main(String args[]) {
	int a=-1,b=1,num=0,c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit for fibonnaci series");
	num=sc.nextInt();
	for(int i=0;i<num;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c+"\n");
	}
	sc.close();
}
}
