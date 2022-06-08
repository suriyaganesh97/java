package small;
import java.util.*;
//if These are the conditions for a leap year .
//The year is evenly divisible by 4; 
//		If the year can be evenly divided by 100, it is NOT a leap year, unless; The year is also evenly divisible by 400
public class LeapYear {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a year:");
	int year=sc.nextInt();
	if(year%4==0) {
		if(year%100==0) {
			if(year%400==0) {
				System.out.println(year+" is not a leap year");
			}
			else {
				System.out.println(year+" is a leap year");
			}
		}
		else {
			System.out.println(year+" is a leap year");
		}
	}
	else {
		System.out.println(year+" is not a leap year");
	}
	sc.close();
}
}
