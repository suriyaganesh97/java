package codeExercises;

public class EqualSumChecker {

	public static void main(String[] args) {
		boolean value=EqualSumChecker(1,-1,0);	
		System.out.println(value);

	}
	public static boolean EqualSumChecker(int num1,int num2,int num3)
	{
		return ((num1+num2)==num3);
	}

}
