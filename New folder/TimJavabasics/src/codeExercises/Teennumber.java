package codeExercises;

public class Teennumber {

	public static void main(String[] args) {
		boolean value1=hasTeen(13,14,5);
		boolean value2=isTeen(13);
		System.out.println(value1);
		System.out.println(value2);

	}
	public static boolean hasTeen(int num1,int num2,int num3){
		if((num1>=13&&num1<=19)||(num2>=13&&num2<=19)||(num3>=13&&num3<=19))  //numbers between 13-19 are teen numbers
			return true;
		else
			return false;
	}
	public static boolean isTeen(int num4)
	{
		if(num4>=13&&num4<=19)
			return true;
		else
			return false;
	}
}
