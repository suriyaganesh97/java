package codeExercises;

public class EqualNumber {
public static void main(String[] args)
{
	boolean value=areEqualByThreeDecimalPlaces(3.1756,3.1757);
	System.out.println(value);
}
public static boolean areEqualByThreeDecimalPlaces(double num1,double num2)
{

/*	
    int num1=(int)num1*1000;
	int num2=(int)num2*1000;
    if(num1==num2)
		return true;
	else
		return false;
		*/
	return (int)(num1*1000)==(int)(num2*1000);  // simpler way to code, we are type casting to int so that
}

}
