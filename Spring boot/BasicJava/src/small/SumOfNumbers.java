package small;
import java.util.*;
//program for  Finding sum of numbers upto n
public class SumOfNumbers {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int lim=0, i, sum=0;
	System.out.println("enter a number to find sum of numbers");
	lim=sc.nextInt();
	for(i=0;i<=lim;i++) {
		sum+=i;
	}
	System.out.println(sum);
	sc.close();
}

}
