package codeExercises;

public class LeapYear {

	public static void main(String[] args) {
		boolean year=isLeapYear(2016);
 System.out.println(year);
	boolean year1=isLeapYear(-1600);
System.out.println(year1);
boolean year2=isLeapYear(1600);
System.out.println(year2);
boolean year3=isLeapYear(2017);
System.out.println(year3);
boolean year4=isLeapYear(2000);
System.out.println(year4);
	}
	public static boolean isLeapYear(int year)
	{
		if(year>=1  && year<=9999)  // checking for valid years
		{
			if(year%4==0)
			{
				if(year%100==0)  //divide by 100 alone not a leap year
				{
				if(year%400==0)
				{
					return true;  //divide by 400 like 800,1200 are leap years
				}
				else
					return false;
				}
				else
					return true;  // only divided by 4 is leap year
			}
			else
				return false;  // not divided by 4 not a leap year
		}
		else
			return false;
	}

}
