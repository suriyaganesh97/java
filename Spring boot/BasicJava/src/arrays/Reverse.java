package arrays;
import java.util.*;
public class Reverse {
public static void main(String args[]) {
	int[] num1= new int[10];
//	int[] num1= {10,2,6,3};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of elements in array");
	int numofele=sc.nextInt();

	System.out.println("enter elements of array");
	for(int i=0;i<numofele;i++) {
		num1[i]=sc.nextInt();
	}
	for(int j=numofele-1;j>=0;j--) {
		System.out.println(num1[j]);
	}
	sc.close();
}
}
