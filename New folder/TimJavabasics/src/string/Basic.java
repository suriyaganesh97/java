package string;

public class Basic {

	public static void main(String[] args) {
		String mystring="This is a String";
		System.out.println("the value of the string is "+mystring);
		mystring= mystring+" more to add";
		System.out.println("the value of the string is "+mystring);
		mystring= mystring+" \u00B5";  // unicode value for mu
		System.out.println("the value of the string is "+mystring);
		
		int num1=10;
		String myString1="2020";
		myString1=myString1+num1;
		System.out.println(myString1);  // it prints output only as string literal
		
	}

}
