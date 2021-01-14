package string;

public class Parse {

	public static void main(String[] args) {
		String numAsString="2018";
		int num=Integer.parseInt(numAsString);  //it converts a string into the numerical value
		numAsString+=1;
		num+=1;
		System.out.println(numAsString);  // it still is a string so the 1 is appended to the string
		System.out.println(num);    // it is a numeric value so number is added
		
	}

}
